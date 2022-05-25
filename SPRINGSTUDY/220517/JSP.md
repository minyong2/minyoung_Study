1. https://start.spring.io/
2. workspace에 zip파일 이동
3. 여기에 압축 풀기
4. (이클립스에서) file -> import -> gradle
5. yaml 수정
6. sqlmap 패키지 생성
7. sqlmapper.xml 생성
8. banner,logback 추가
9. mvc 생성
10. 프로젝트 이름 우클 and source folder
11. WEB-INF 만들고 또 안에 views를 만든다.
---

jsp는 html 안에서 java코딩이 가능한 파일

---
- 회사에서 메이븐 쓴다고 하면
```
clone -> import maven
```
---
```java
public class BoardController {
	
	@GetMapping("/home")
	public String callHomepage() {
		
		return "index";
	}
}

return에 jsp 파일 이름 리턴
```
---
```jsp
--- yaml ---
#JSP 경로 설정
   mvc : 
      view :
         prefix : /WEB-INF/views/
         suffix : .jsp
         
      #css,js,image 폴더 위치 설정
      static-path-pattern : /resources/static/**
```
```
spring:
   datasource:
   initialization-mode : always
      schema : classpath:init.sql
      driver-class-name : com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://localhost:3306/dw?useUnicode=true&charaterEncoding=utf-8&serverTimezone=UTC
      username: root
      password: bs07360012!

initialization-mode : always - > 항상 실행
initialization-mode : never - > 실행 안시킴
```
---

```
html과 css - 퍼블리셔가 만듦

그걸 백엔드 개발자에게 줌
"이제 백엔드 작업하세요~"

그 때 백엔드 개발자는
1. 파일 확장명을 html에서 jsp로 다 변경
2. 폴더에 다 넣어줌
3. js랑 css는 그대로 static 내부에 넣어주면 됨~
```


### 학생
학생 이름 , 번호 

 1:N 관계

### 게시판
작성날짜 , 내용  , 제목 , 마지막 수정 날짜 


```SQL
--- 학생 테이블
CREATE TABLE IF NOT EXISTS students(
	students_id INTEGER(4) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '학생 아이디',
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

여기서 AUTO_INCREMENT은 COUNT++과 같이 1씩 증가하는 것
```

- DB에 PASSWORD는 암호화 하기때문에 글자 수 제한을 크게 해야함.
  
    ex) students_password VARCHAR(200) COMMENT '학생 비밀번호'

```
CREATE database IF NOT EXISTS DW DEFAULT CHARACTER SET utf8_general_ci;
만약 dw라는 database가 없으면 create
```

![spirng_initializr](https://user-images.githubusercontent.com/97263974/168750387-fbe0cd2a-1735-4d65-8dad-b7d42b4f9d14.png)

![화면 캡처 2022-05-17 110137](https://user-images.githubusercontent.com/97263974/168750465-c529c24d-aabe-4737-8114-2c8c3d7cc212.png)