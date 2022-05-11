- 문제 : emp에 없는 부서번호를 찾아서 사원을 insert 하시오
```java
--- MAPPER ---
public int inserEmp(EmpVO empvo); //데이터 삽입v
public EmpVO selectDeptNo();//v

--- SERVICE ---
@Transactional(rollbackFor = {Exception.class})
	public int setEmp(EmpVO vo) {
	
		EmpVO empVO = empMapper.selectDeptNo();
		int deptNo = empVO.getDeptno();
		vo.setDeptno(deptNo);

        여기여기여기여기여기여기여기여기위에위에위에위에
		
		//몇행이 insert가 되었는지 리턴
		int rows = empMapper.inserEmp(vo); 
		return rows;
	}

--- CONTROLLER ---
@PostMapping("/emp")
	public int callEmpSet(@RequestBody EmpVO empvo) {
		return empService.setEmp(empvo);
	}
```

```XML
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

    <select id="selectDeptNo" resultType="EmpVO">
	SELECT d.DEPTNO FROM emp AS e
	RIGHT JOIN dept AS d 
	ON e.DEPTNO = d.DEPTNO 
	WHERE e.EMPNO IS NULL 
	<!-- 출력문이 단일행이라 EmpVO . 복수행?이었으면 List<EmpVO> -->
	</select>
```
```
끔찍한 혼종을 쓰는 이유
url에서 어떤것에 관련된 주소인지 미리 알 수 있어서.
```
