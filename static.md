### 학원 못가서 따로 보는 스태틱......

```
static의 목적은 '공유'
static은 인스턴스화를 하지 않아도 호출이 가능!
```

```
class Chef{
    static int x;
}

Chef c1 = new Chef();
c1.x = 10;
Chef c2 = new Chef();
c2.x = x + 10; //20이 나온다!
```

```
class Member{
    static String NAME = "홍길동";
    static int AGE = 30;
}

String name = Member.NAME;  //static 변수는 new없이 바로 호출
int age = Member.AGE //static 변수는 new없이 바로 호출
```

## 결론 : static을 사용하는 경우!
1. 코드를 정의할 때! 단 , 해당 클래스에는 변수만 존재
```
public static final String NEW_RELEASE = "release_new"; // 출고 첫 등록
public static final String NEW_WAREHOUSING = "warehousing_new"; //입고 첫 등록
```
2. 객체를 여러개 생성해서 사용하는 상황일 때(싱글톤 패턴) ex) 데이터베이스 연동할 때


### 여기서 singleton 패턴이란?
    singleton은 '단독 개체', '독신자'라는 뜻 말고도 '정확히 하나의 요소만 갖는 집합' 등의 의미가 있다. singleton 패턴은 객체의 생성과 관련된 패턴으로서 특정 클래스의 객체가 오직 한 개만 존재하도록 보장한다. 즉 클래스의 객체를 하나로 제한한다.

```
여러 컴퓨터에서 프린터 한 대를 공유하는 경우, 한 대의 컴퓨터에서 프린트하고 있을 때 다른 컴퓨터가 프린트 명령을 내려도 현재 프린트하는 작업을 마치고 그다음 프린트를 해야지 두 작업이 섞여 나오면 문제가 될 것이다. 즉 여러 클라이언트(컴퓨터)가 동일 객체(공유 프린터)를 사용하지만 한 개의 객체(프린트 명령을 받은 출력물)가 유일하도록 상위 객체가 보장하지 못한다면 singleton 패턴을 적용해야 한다. 이처럼 동일한 자원이나 데이터를 처리하는 객체가 불필요하게 여러 개 만들어질 필요가 없는 경우에 주로 사용한다.
```
