'java jdbc 연결'

- 치명적인 단점

sql을 사용 할 때마다 로그인을 해야 함

---
```
CREATE, DROP , ALTER (DDL)
SELECT, INSERT ,DELETE, UPDATE (DML)

1.DDL과 DML의 핵심 차이점?
=> Auto Commit의 여부

2.Mybatis Insert, Delete, Update
자동으로 commit;

3.Mybatis Insert, Delete, Update return은 int

4.Insert, Delete, Update (DML, ***트랜잭션)
DB에서 Update란 없음, Insert&Delete 뿐

```
---
```
https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%AC%B4%EC%8B%A0%EC%82%AC&oquery=DDL+DML+%EC%B0%A8%EC%9D%B4&tqi=hFmoJdp0JXossQeIRN8ssssstFZ-296825

이런 url에서 ?는 쿼리스트링 이라고 함.
? 뒤에있는 
/를 기준으로 나누겠다. 
```
---
```
주소가 같으면 안되는데 주소가 같을 때
    *이름은 같은데 기능이 다르면 같은 주소를 쓸 수 있음
ex) (X)
    GetMapping("/naver/news")
    GetMapping("/naver/news")
    
ex) (O)
    GetMapping("/naver/news")
    PostMapping("/naver/news")


    GET,POST,DELETE,PATCH (HTTP의 메소드() OR 기능 OR 함수)
    - 중요한 정보를 전송할 때 Post 사용 (ex 회원가입)



```


