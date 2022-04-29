1. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public int getCount(List<Object> list){
        return 0;
    }
    //리턴 타입 : int
    //메소드 이름: getCount
    //파라미터 타입 : object
```

2. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public void insertData(Map<String, Object> map){

    }
    //리턴 타입 : void 
    //메소드 이름: insertData
    //파라미터 타입 : String , object
```

3. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public List<Object> list insertData(String str){
        return null;
    }
    //리턴 타입 : object
    //메소드 이름: insertData
    //파라미터 타입 : String
```

4. 오버라이딩(Overriding)과 오버로딩(Overloading)이 무엇인지 간략히 기술하시오.
오버라이딩은 자식클래스에서 부모클래스의 메소드를 재정의하여 갖다 쓰는게 목표
오버로딩은 같은 클래스 or 상속 관계에서 동일한 이름의 메소드 중복 가능하며 동일한 이름의 메소드를 선언 할 수 있어 편리

5. 추상클래스와 Interface(인터페이스)에 차이점을 간략히 기술하시오.
- 인터페이스
    특징:
    1. 추상메소드, 변수만 존재
    2. 다중상속을 구현할 수 있음
    3. ***인스턴스화(new) 할 수 없다.
    
- 추상메소드
    특징:
    1. 오버라이딩을 해야함
    2. 구현X, 선언만!
    3. public 이어야 함
    4. 앞에 abstract 키워드 붙는다


6. 상속에 대해 아는 내용을 간략히 기술하시오.
 공통기능 class를 만들어서 필요한 클래스에서 호출하며 사용
 기능이 같은 메소드의 중복을 방지하며 슈퍼클래스에서 메소드를 설정해주면 서브클래스에서 상속받아 사용 가능
 속도와 메모리 공간의 문제를 해결 할 수 있음.

7. 생성자에 대해 아는 내용을 간략히 기술하시오.
 특수 함수이며 리턴이 없음
 함수 이름은 클래스 이름과 동일
 디폴트 생성자 존재
 사용 이유는 필드 변수에 값을 대입하기 위해서


8. 컬렉션에 대해 아는 내용을 간략히 서술하시오.
 프레임워크 혹은 컨테이너 , 컬렉션도 배열이나 기존에 배웠던 배열과는 다르게 길이를 유동적으로 제어할 수 있음

9. 아래 코드를 보고 예상되는 결과는?

```java
    class A{

        public static int count;
        public int temp;

    }
    class B{

        main(){

            A a1 = new A();
            a1.count = 10;
            a1.temp = 20;

            A a2 = new A();
            a2.count = 20;
            a2.temp = 20;

            System.out.println(a1.count); // 답 : 10
            System.out.println(a1.temp); // 답 : 20

            System.out.println(a2.count); // 답 : 20
            System.out.println(a2.temp); // 답 : 20
        }
    }

```

10. 아래 코드를 보고 예상되는 결과는?

```java
    class A{
        public int money;
    }
    class B{
        public A getInstance(){
            A a = new A();
            return a;
        }
    }
    class C{
        main(){
            B b = new B();
            A a = b.getInstance();
            a.money = 1000;
            a = b.getInstance();
            a.money = a.money + 1000;
            System.out.println(a.money); // 답 : 2000
        }
    }
```

11. getter, setter을 이용하지 않고 필드변수 값을 초기화 하는 방법을 아래 코드로 작성하시오.

```java
class A{
    private String name;
    private int age;

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }

}
```