```java

--- CONTROLLER ---
@PatchMapping("/emp/empno/{empno}")
	public int callEmpSalUpdate(@PathVariable("empno") int empno) {
		
		return empService.getEmpUpdateCommSal(empno);
		
	}

--- SERVICE ---
public int getEmpUpdateCommSal(int empno) {
		//COMM이 0혹은 null이면
		EmpVO vo = empMapper.selectEmpCommSal(empno);
        //select를 받아옴
		int comm = vo.getComm();
        //받아온 select의 comm 을 int comm에 넣어줌
		if(comm == 0) {
			int bonus = 500;
			int sal = vo.getSal();
        // empvo의 sal을 받아옴
			vo.setSal(sal+bonus);
			return empMapper.updateEmpSal(vo);
        //vo를 넣어서update로 리턴을 해줌.
		}
		return 0;
	}

---MAPPER---
public int updateEmpSal(EmpVO vo);
    //들어온 vo를 통해 update 실행
	
public EmpVO selectEmpCommSal(@Param("empno") int empno);
	//empno 조회하는거라 EmpVO ! EmpVO는 PK니까!
    //{empno}로 조회
```
```xml
<select id="selectEmpCommSal" resultType="EmpVO">
	SELECT
		comm,
		sal
	FROM emp
	WHERE empno = #{empno}	
	</select>
	
	<update id="updateEmpSal">
	UPDATE emp
	SET sal = #{sal}
	WHERE empno = #{empno}
	
	</update>
```