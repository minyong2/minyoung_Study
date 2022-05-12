```
SELECT : map
    => 조인이 많아지면 필드변수가 늘어남! 이때 hashmap을 써주면 편리
        장점 : 컬럼이름에 맞게 알아서 매핑
        하지만 뭐가 return될지 파악이 어려움
        
DELETE,UPDATE,INSERT : vo
    => vo클래스에 미리 필드변수를 정의해서 문서화, 유지보수 가능
```

근데 뭐가 return될지 파악하기 어려움
```java
--- CONTROLLER ---
	@GetMapping("/emp/map/list")
	public List<Map<String,Object>> callEmpMap(){
		return empService.getEmpMapList();
	}

--- SERVICE ---
	public List<Map<String,Object>> getEmpMapList(){
		return empMapper.selectEmpMapList();
	}

--- MAPPER ---
	public List<Map<String,Object>> selectEmpMapList();
```

```xml
	<select id="selectEmpMapList" resultType="map">
	SELECT 
		empno,
		ename,
		job,
		sal,
		e.DEPTNO,
		d.dname,
		d.loc
	FROM emp AS e
	INNER JOIN dept AS d
	ON e.deptno = d.deptno
	</select>
```