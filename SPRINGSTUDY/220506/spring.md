- 메소드 이름
```
Controller : 앞에 call, load
    1. callEmpInfo() ~
    2. loadEmpInfo() ~

Service : 1. get, set , 동사표현 (make, upload, download etc...)

Mapper :
1. find(select), save(insert, update), delete
2. get, set
(v) 3. select, update, insert, delete
```

---
![제목 없음](https://user-images.githubusercontent.com/97263974/167049227-817db46c-3f56-4ba1-84d3-f5a736b76855.png)
---

- 오늘은 ~ 파라미터 받는 법
```
컨트롤러 : url 요청
    컨트롤러에서 파라미터를 받는 방법
    -종류-
    1.RESTful
    2.Query String ?

    주소(URL)를 의미있게 네이밍 하는 방법을 Restful이라고 함
```

---
- 파라미터 받는 법 
```xml
	<select id="getEmp" resultType="EmpVO">
	SELECT ename FROM emp
	WHERE empno = #{empNo}
    <!-- #{empNo}는 mapper의 파라미터와 같아야 함 -->
	
	</select>
```
---
- Controller
```java
@GetMapping("/emp/job/{job}/sal/{sal}")
	public List<EmpVO> callJobManager(
			@PathVariable("job") String job ,
			@PathVariable("sal") int sal) {
		return empService.getJobManager(job,sal);
	}
	
```
```
@PathVariable("sal")랑 @GetMapping("/emp/job/{job}/sal/{sal}")의 {sal}이랑 같아야함 . int sal은 int x가 되어도 됨

=> int x가 되면 return empService.getJobManager(job,x);가 되겠죠?
```
- Service
``` java
	public List<EmpVO> getJobManager(String job, int sal) {
			if(job.equals("SALESMAN")) {
				return null;
			}
		return empMapper.getJobManager(job, sal);
	}

```
- Mapper
```xml
public List<EmpVO> getJobManager(
			@Param("job") String job,
			@Param("sal") int sal);

}
<!-- 파라미터가 여러개인건 @Param 사용해줘야함 -->
```
---
