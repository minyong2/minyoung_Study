### DML
```
삽입(insert)하고 수정(update)은 파라미터로 객체를 넘겨준다

오늘의 내용은 CRUD!
```
``` java
@Data
public void test1(){
    //test1에서 test를 사용하고자 함.
===방법 1
    UserVO vo = new UserVO();
    test(vo);

===방법 2
    test(new UserVO());
}

public void test(UserVO vo){

}
```
### - Post로 데이터 받기
```java
POST !!!
@PostMapping("/emp")
	public int callEmpSet(@RequestBody EmpVO empvo) {
		System.out.println("사원 이름은 : " + empvo.getEname());
		System.out.println("사원 번호는 : " + empvo.getEmpno());
		return 0;
	}

---Postman에서 json형식으로 입력하면 ---
    {
    "ename" : "김민영",
    "empno" : 1
}

// ==> null로 리턴되는 경우 대부분 오타일 수 있음
//     (주니어 시절 잦은 이슈)

---console---
사원 이름은 : 김민영
사원 번호는 : 1
```
<br>


# INSERT !
```java

--- CONTROLLER ---
    @PostMapping("/emp")
	public int callEmpSet(@RequestBody EmpVO empvo) {
		System.out.println("사원 이름은 : " + empvo.getEname());
		System.out.println("사원 번호는 : " + empvo.getEmpno());
		System.out.println("사원 직업은 : " + empvo.getJob());
		return empService.setEmp(empvo);
	}

--- SERVICE ---
	public int setEmp(EmpVO vo) {
		int rows = empMapper.inserEmp(vo); //몇행 insert가 되었는지 리턴
		return rows;
	}

--- MAPPER ---
	public int inserEmp(EmpVO empvo);
```
```xml
--- XML ---
	<!-- 오라클은 mybatis insert할 때 pk 문법이 다름(시퀀스를 추가해야함)  구글링 해보기-->
	<insert id="inserEmp">
	Insert into emp
	(
		empno,ename,deptno,hiredate
		
	)
	VALUES
	(
		#{empno},
		#{ename},
		#{deptno},
		now()
	)
	
	</insert>
```
<br>

---
# DELETE
```java
--- CONTROLLOER ---
    @DeleteMapping("/dept/deptno/{deptno}")
	public int deleteDept(@PathVariable("deptno") int deptno) {
		
		return deptService.deleteDept(deptno);
	}

--- SERVICE ---
    public int deleteDept(int deptno) {
		int rows = deptMapper.deleteDept(deptno);
		return rows;
	}

--- MAPPER ---
    public int deleteDept(int deptno); //데이터 삭제
```
```xml
--- xml ---
<delete id="deleteDept">
delete from dept
where deptno = #{deptno}
</delete>
```
<br>

---
# UPDATE
```java
--- CONTROLLOER ---
	@PatchMapping("/dept")
	public int updateDept(@RequestBody DeptVO deptvo) {
		
		return deptService.updateDept(deptvo);
	}

--- SERVICE ---
	@Transactional(rollbackFor = {Exception.class})
	public int updateDept(DeptVO deptvo) {
		int rows = deptMapper.updateDept(deptvo);
		return rows;
		
	}

--- MAPPER ---
    public int updateDept(DeptVO deptvo);
```
```xml
--- XML ---
<update id="updateDept">
update dept
set 
	dname = #{dname},
	loc = #{loc}
where
	deptno = #{deptno}
</update>
```
<br>

---


- update 로직을 잘못짜서 엉뚱한 데이터로 update가 실행됐다면?
## @Transactional(rollbackFor = {Exception.class})
    이전 커밋으로 돌아가는 어노테이션
    -> rollback 해주는 어노테이션 

---
```
오류 종류
500 -> 자바에러
SQL결과가 없어도 NULL이 뜬다.

https://sorjfkrh5078.tistory.com/104
-> Java 예외의 종류 정리 사이트
```

### 직업이 manager이고 sal이 2500인 사람에게 comm 500부여 후 select 하시오
```java
	//job이 manager고 sal이 2500이상인 사원 comm 700으로 업데이트
	@Transactional(rollbackFor = Exception.class)
	public List<EmpVO> getJobManager(String job, int sal) {
		int comm = 500; //commition
		int rows = 0;
			List<EmpVO> list = empMapper.getJobManager(job, sal);
			for(int i=0; i<list.size(); i++) {
				list.get(i).setComm(comm);
				EmpVO vo = list.get(i);
				vo.setComm(comm);
				rows += empMapper.updateEmp(vo);
			}
			if(rows > 0) {
				return empMapper.getJobManager(job, sal);
				
			}
		return null;
	}
	
```