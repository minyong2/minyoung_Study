### 05월 02일
```
    스프링을 배우자!
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

```
- Spring 배우는 이유?
```
Spring은 검증된 툴!
검증 되었으니 회사에서 Spring을 사용
=>회사에서도 Spring을 사용하는 개발자를 원함

교육기관에서도 Spring을 베이스로 교육

결론 ! 수요가 많음 !!
```

- Spring 이란?
```
JAVA로 다양한 어플리케이션을 만들기 위한 프레임워크

쉽게 생각해서~ 플랫폼(spring) -> 프레임워크
```

- Spring 종류
1. spring 레거시 (일반 spring)
2. spring boot (경량 spring)
3. spring 전자정부프레임워크 (egov)

(1~3번은 비슷)

## *** spring하고 같이 사용하는 친구들
Spring만으로 어플리케이션을 개발하는데 한계가 있음

DB,고객에게 보여줄 화면 필요 등등...

```
1. DB연결과 데이터 생성, 호출, 삭제, 수정을 도와주는 ORM
    - MyBatis(V),JPA 
2. 필요한 기능을 쉽게 다운로드 받을 수 있고, 서버에 업로드(배포)를 도와주는 빌드관리도구(Build Tool)
    - Gradle(V), Maven
3. 화면을 담당하는 템플릿 엔진
    - JSP,Thymeleaf(V)
4. 속성(DB주소,아이디,패스워드)정의를 담당하는 속성 파일
    - Yaml(야믈)(V),properties
5. 서버를 담당하는 Tomcat(V)

6.(Optional) 그 외 Docker(도커), GraphQL(그래프큐엘) 등등...
```
### ☆★☆★
    회사에서 이클립스 or sts

### 스프링의 약속
    패키지는 3개부터 시작하는것이 약속이다~
    ex) com.naver.www
    ex) com.dw.board

    첫번 째 패키지 : com, io, kr 등등
    두번 째 패키지 : 회사 이름
    세번 째 패키지 : 프로젝트 명
---
    1. controller 패키지 생성
    controller : url요청을 받는 곳
    @Controller 이라고 작성하고 import 해줘!!

    2. http
    GET : select
    @GetMapping("/")
    POST : insert
    DELETE 
    PATCH
---
    TempleteController를 사용한다면 @Controller
    TempleteController를 사용하지 않는다면 @RestController

    @GetMapping("/") => 겟매핑을 써줘야 인식!

    @Getter ,@Setter or @Data

    @AllArgsConstructor 모든 필드 값을 파라미터로 받는 생성자를 만듦
---
- 내 주소 검색
```
localhost:port/index
```
---
- 포트 번호
```
자바 : 8080
sql,db : 3306
```

    
