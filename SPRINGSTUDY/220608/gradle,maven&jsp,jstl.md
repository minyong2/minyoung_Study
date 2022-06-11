### gradle
```
코딩가능 , 프로그래밍 언어임
```

### maven
```
xml 파일!
```

### JSP
    HTML+JS+CSS = HTML
    HTML+JS+CSS+JAVA = JSP

JSP => `J`ava`S`erver`P`age

    JSP,타임리프 : 템플릿엔진

    기존에는 외부에서 .html처럼 아예 외부에서 호출했기때문에 @CrossOrigin 에러 떴지만
    JSP는 내부에서 선언하기 때문에 @CrossOrigin을 선언 할 필요가 없음.
    JSP는 외부에서 선언하면 실행이 안됨 , 절대 자바 안에 있어야함

    *~@%!!아작스가 가능하다!!%@~*

### jstl
    jstl이란?
    JSP가 나오고 jstl이 나옴

### jsp문법 정확히는 jstl
```java
@GetMapping("/home")
	public String callHomePage(ModelMap map) {
		map.addAttribute("name","손흥민"); //name은 key, 손흥민은 value
		map.addAttribute("backNumber",7);		
		return "index";
	}


<head>
<meta charset="UTF-8">
<title>JSP Study!</title>
</head>
<body>
	<h1>Hello World!!!!!!!!!!!</h1>
	<h3>${name}</h3>
	<h3>${backNumber}</h3>
		<!-- <c:if>는 jstl문법, else는 없음, jsp에서의 if문 -->
	<c:if test="${backNumber == 7}">
        <h4>대한민국 만세!</h4>
        // {}조건에 맞으면 if내부 문을 보여줘!
	</c:if>
    <!-- 문자비교 -->
	<c:if test="${name.equals('손흥민')}">
    <h4>코리아 만세!</h4>
	</c:if>
</body>
</html>

```
    