Lombok이란?
===========
    Lombok이란 Java의 라이브러리로 반복되는 메소드를 *Annotation* 을 사용해서 **자동** 으로 작성해주는 라이브러리
    
    보통 DTO나 Model,Entity의 경우 여러 속성이 존재하고 이들이 가지는 프로퍼티에 대해 getter, setter, 생성자 등을 매번 작성해 줘야하는데 이를 자동으로 만들어주어 번거로움을 줄여줌.

    하지만 다른 라이브러리와 충돌이 발생할 수도 있고 내가 원하지 않는 방식으로 작동할 수 있기 때문에 각 API가 어떤식으로 작동하는지 숙지해야 함
---
## @NonNull
- 메소드나 생성자의 매개변수에 @NonNull을 사용하면 lombok이 null을 check 해준다.
```java
class Person{
    private String name;
    private int age;
​
    public Person(@NonNull String name, int age) {
        this.name = name;
        this.age = age;
    }
}
// build
class Person {
    private String name;
    private int age;
​
    public Person(@NonNull String name, int age) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        } else {
            this.name = name;
            this.age = age;
        }
    }
}
```
## @AllArgsConstructor
    모든 필드에 대한 생성자를 만들어준다. 
    마찬가지로 @NonNull 필드에 대한 null check 구문을 생성해준다.

## @Data
    모든 필드에 대해 @ToString, @EqualsAndHashCode, @Getter를, 모든 non-final 필드에 대해 @Setter를 설정하고 
    @RequiredArgsConstructor를 설정해주는 단축 Annotation이다.

## @Autowired
    @Autowired를 활용한 DI는 필드 주입이라고 한다.
    생성자 , setter , 필드 를 자동 생성 (수업때는 new인스턴스화에만 적용해봄)

    하지만 생성자 주입, @RequiredArgsConstructor 을 더 권장한다고 함
    ----------------------------------------------------------------------
    코드가 간결해진다는 장점이 있으나 DI를 해줄 Framework가 없으면 구현체 지정이 불가하기 때문에 Test하는 것도 자유롭지 못하다. 따라서 사용을 권장하지 않는다.
    [출처] [Spring] @Autowired를 이용한 의존 관계 주입 방법|작성자 Nablekim

## @RequiredArgsConstructor 
    final 필드에 대해 생성자를 만들어주는 lombok의 annotation.
    Spring Framework의 DI(의존성주입) 중 Constructor Injection(생성자 주입)을 임의의 코드 없이 자동으로 설정.


# 더 추가예정 