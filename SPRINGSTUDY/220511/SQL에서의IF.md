## SQL에서의 `IF문!`
```xml
true가 파라미터로 들어오면 사수 있는 사람 조회
false가 파라미터로 들어오면 사수 없는 사람 조회

<select id="selectEmpMgr" resultType="EmpVO">
	SELECT 
		ename,
		empno,
		mgr
	FROM emp e
	WHERE 1=1
	<if test='isMgr.equals("true")'>
		AND mgr IS NOT NULL
	</if>
	<if test='isMgr.equals("false")'>
		AND mgr IS NULL
	</if>
	</select>


   postman => http://localhost:8080/emp/mgr/false

```
```
<if test=""> </if>
에서 test는 괄호 역할!
if(x=10){
}
```
```
ture가 파라미터로 들어오면 사수 있는 사원 조회
false가 파라미터로 들어오면 사수 없는 사원 조회
Mybatis는 boolean형이 없어서 문자로 비교해야 함
```

### 문제
    1. 사원번호가 7908번인 사원 job을 salesman, sal을 3500으로 수정하시오
    2. 사원번호가 7844번인 사원의 comm이 
       만약 0이거나 null이면 
       기존 급여에서 500을 추가(수정) 하시오. (3000->3500)