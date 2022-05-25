## 스프링부트에서 url로 파라미터를 전달하는 2가지 방법
- type 1 : 쿼리 스트링
- type 2 : REST

### `쿼리 스트링`
```
쿼리스트링으로 파라미터를 URL로 전송할 때 
컨트롤러에서 파라미터를 `@RequestParam`을 사용한다.
```
```java
@RestController
public class MyNameIs{
    @Autowired
    NameService namesevice;

    @GetMapping("/my")
    public List<NameVO> getMyNameIs(@RequestParam name String name){
        return nameservice.selectMyNameIs(name);
    }
}

==> GET http://localhost:8080/my?name=민영
```
```
@RequestParam 어노테이션을 컨트롤러 파라미터에 작성하면 쿼리 스트링으로 들어오는 영역에서 name값을 매핑해서 가져올 수 있다.

⊙ 파라미터 표현법
1. @RequestParam name String name
2. @RequestParam String name
```

### `REST`
```
Restful하게 파라미터를 받기 위해서 컨트롤러에서 @PathVariable을 사용한다.
@PathVariable의 경우 `url에서 각 구분자에 들어오는 값을 처리`해야 할 때 사용.

*여기서 Restful 이란?
=> Restful은 일반적으로 Rest라는 아키텍처를 구현하는 웹 서비스를 나타내기 위해 사용되는 용어! 'REST API'를 제공하는 웹 서비스를 'RESTful'하다고 할 수 있다.

!! 즉 REST 원리를 따르는 시스템을 Restful이란 용어로 지칭된다
```
```java
@RestController
public class MyNameIse{
    @Autowired
    NameService namesevice;

    @GetMapping("/my/name/{name}")
    public List<NameVO> getMyNameIs(@PathVariable("name") String name){
        return nameservice.selectMyNameIs(name);
        }

}

=> GET http://localhost:8080/my/name/민영
```

### @RequestParam 또는 @PathVariable 하나만 사용하는 것이 아닌 복합적으로 사용을 하기도 한다.