## Spring Bean
```
생성부터 소멸까지 관리해주는 class!
스프링이 제어하는 클래스를 Bean이라고 함.
[ IoC -> 스프링이 제어하는 것 ] 
```
---
Spring <-> DB ORM
```
데이터베이스 연결과 데이터 생성, 호출, 저장, 삭제를 담당하는 ORM!
* ORM이 뭐냐!
=> spring과 db의 관계를 mapping 해준다!

[spring]  <--orm-->  [db]
         <--return--          //vo에 리턴


* ORM종류
- MyBatis(V)
- JPA

```
---
- 속성 정의를 담당하는 속성 파일은?

```
Yaml , properties

resources 패키지에 참조 할 경로를 써줘야 함.

내 sql 파일이 어디있는지 위치를 써줌
html,css,js,image 등등 .. 자바와 관련 없는것들이 들어감
```
## - application.yaml
```yaml
#MyBatis 설정
mybatis:
   mapper-locations: classpath:/sqlmap/sqlmapper_*.xml
   type-aliases-package: com.example.first_spring.vo
    #내 쿼리의 return 값을 vo로 받겠다. -> sql 결과가 vo클래스에 리턴됨

#MySQL 접속정보 설정
spring:
   datasource:
   driver-class-name : com.mysql.cj.jdbc.Driver
   url: jdbc:mysql://localhost:3306/dw?useUnicode=true&charaterEncoding=utf-8&serverTimezone=UTC
   username: root
   password: bs07360012!
```
---
```
help -> eclipse marketplace -> find : yaml
다운받으면 yaml Editor를 사용할 수 있다~
```

### `XML`
```
태그가 있는 파일
SQL 쿼리를 갈겨주면 된다.
```
### MAPPER 란?
```
Mybatis 매핑XML에 기재된 SQL을 호출하기 위한 인터페이스이다. 
Mybatis3.0부터 생겼다.
DB 조회를 해줌
```
<br>
<br>
<br>

---

# `DB연동`
- 원하는 데이터베이스를 불러오고 싶다면
```
ex) Emp 테이블
EmpVO에서 객체를 생성 후
```
```java
ex)

@Data
public class EmpVO {
	private int empno;
	private String ename;
	private String job;

}
```
---
    Controller에 call~~~라는 메소드를 생성하여 Service로 리턴을 해준다.
    (메소드 이름은 회사마다 다름)
```java
@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;

	@GetMapping("/emp/1")
	public EmpVO callEmp() {
		return empService.getEmp();
	}
}

```
---
    Controller에서 return empService.getEmp(); 을 해주었기 때문에
    Service의 getEmp로 들어오고 이 값을
    Mapper로 리턴해줌
```java
@Service
public class EmpService {
	
	@Autowired
	private MainMapper mainMapper;
	
	public List<EmpVO> getAllempList(){
		
		return mainMapper.getEmpList();
	}
	
	public EmpVO getEmp() {
		return mainMapper.getEmp();
	}
}
```
---
    Mapper에서는 받은 값을 토대로 ORM을 통해 MtBatis를 통해 DB와 연결된 후 vo로 보내준다.
```java
@Mapper
public interface MainMapper {
	
	public List<EmpVO> getEmpList();
	
	public EmpVO getEmp();
}
```
---
---

## 각 패키지 정리
`Controller`
```
@RestController , @Autowired , @GetMapping("")
역할 : url 요청을 받는 장소

@GetMapping : http에서 GET! GET은 SELECT / url index부분 지정해줌, 중복 불가능
@Autowired : 생성자, 소멸자 관리 메소드
```

`Service`
```
@Service , @Autowired
역할 : 비지니스 로직 구현 단계 , 계산 수행 , 외부 API 호출 수행

@Service : 이곳이 Service 라는걸 다른 클래스에 알려줌
@Autowired : 생성자, 소멸자 관리 메소드
```

`Mapper`
```
@Mapper
역할 : ORM(MyBatis)을 통해 DB와 연결된 후 값을 vo로 리턴해준다. DB 조회!!

@Mapper라는 것을 알려줌 ~
```
---
## 클래스 생성 순서
```
1. Mapper를 만든 후 OMR을 통해 db와 연동
2. Service 생성
3. Controller 생성

수행 순서와 반대로 생성 ~?
```