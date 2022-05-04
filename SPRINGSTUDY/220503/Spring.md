### vo 클래스
    < vo = DTO >
    내부에 getter setter밖에 없음!

<!-- ### < LOMBOK , DEVTOOLS > -->



```
1. 문제를 풀 때 마다 controller에 코드가 길어지면 유지보수가 힘들어진다

2. ☆★☆★ MVC(Model-View-Controller) 아키텍처 ☆★☆★
    => 프로그래밍 로직을 서로 *영향없이 쉽게* 수정할 수 있는 SW 디자인 패턴

    Model : 비즈니스 로직 구현(for,arraylist...=> 비즈니스 로직), DB연동 로직

    View : 최종 사용자에게 결과화면(UI)을 보여줌
    
    Controller : 요청을 받아서 화면과 Model을 연결시켜주는 역할


```
-  아키텍처란 ?
```
컴퓨터 아키텍쳐(Computer architecture)의 경우
컴퓨터 구조(computer architecture)는 컴퓨터 공학에서 개념의 설계요, 컴퓨터 시스템의 근간이 되는 운영 구조이다. 

소프트웨어 구조(software architecture)의 경우
소프트웨어의 구성요소들 사이에서 유기적 관계를 표현하고 소프트웨어의 설계와 업그레이드를 통제하는 지침과 원칙이다
```

생성자 소멸자 
```
@Autowired : Spring이 해당 객체를 관리해줌 => IoC(Inversion of Control)

@Autowired를 사용하면 클래스를 호출할 때 new 생략
원래는 MainService service = new MainService(); 이지만
어노테이션을 사용함으로 MainService service;로 가능.

대신 MainService 클래스에 @Service 가 있어야함.
```
### `spring 3대장`
- IoC(Inversion of Control : 제어의 역전)
```
객체의 생성부터 소멸까지 Spring에서 관리함
```

- DI(Dependency Injection : 의존성 주입)
```
Spring이 객체(클래스)가 필요하다면 외부에서 가져다가 주입(대입)하는 방식.
(객체(클래스)를 외부에서 가져다가 쓰기 때문에 new 연산자가 사라짐)
```

- AOP(Aspect Oriented Programming : 관점 지향 프로그래밍) 
```
여러 메소드(함수)에서 중복되는 코드가 있다면, 따로 모아서 재활용 하는 것.
```

```
@Controller는 url 요청이 오면 응답 담당!

@Service는 비즈니스 로직, 계산 수행, 외부 API호출을 수행하는 JAVA클래스를 표시

1. 클래스를 만들면 어노테이션을 먼저 만들자
2.@Autowired 객체 생성과 소멸을 Spring이 관리 => IoC
```

