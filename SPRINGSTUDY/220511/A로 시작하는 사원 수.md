## 'A'로 시작하는 사원 수 찾기
```java
--- CONTROLLER ---
@GetMapping("/emp/name")
	public int callgetCountNameA(
			@RequestParam("search") String search ){
		return empService.getCountNameA(search);
	}

--- SERVICE --- 
	public int getCountNameA(String ename){
		List<EmpVO> list = empMapper.getCountNameA(ename);
			
		return list.size();
	}

--- MAPPER ---
    public List<EmpVO> getCountNameA(String ename);
```
```xml
--- XML ---
	<select id="getCountNameA" resultType="EmpVO">
	select * from emp
	where ename like concat(#{ename},'%')
	</select>
	
```
### '여기서 concat이란?'
    concat이란 여러 문자열을 하나로 합쳐주는 역할을 한다.
    SELECT CONCAT(str1, str2 ...);
```sql
 SELECT 
     CONCAT('성은 김이요', ' ~~ ', '이름은 민영이다')
 FROM
     DUAL;

 > 성은 김이요 ~~ 이름은 민영이다

 SELECT 
     CONCAT('TAMDAO', 'SMELLS', 'GOOD')
 FROM
     DUAL;

 > TAMDAOSMELLSGOOD
```
```

```