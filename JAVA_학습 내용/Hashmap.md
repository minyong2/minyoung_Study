# 해쉬맵(HashMap) 이란?
Collection의 종류는 3가지 Set, List, Map 이 있다.
오늘은 그 중 Map을 공부!

HashMap은 ArrayList랑 다를게 없다. 다만 Key와 Value가 필요하다.
```
HashMap<K,V>        (*K = Key , V = Value)
```

HashMap에 값을 넣고 싶을때는 put 명령어를 이용
```
Public static void main(String[] args){
    HashMap<String, String> my = new HashMap<String, String>();
    my.put("010-1234-5678", "윈터");
    my.put("010-1111-2222", "지젤");
}  

==> Key값은 전화번호 , Value값은 전화번호 주인.
```
```
Public static void main(String[] args){
    HashMap<String, String> my = new HashMap<String, String>();
    String call = "010-1234-5678";
    String call2 = "010-1111-2222";

    my.put(call, "윈터");
    my.put(call2, "지젤");

    sys.out(call + ":" + my.get(call));
    sys.out(call2 + ":" + my.get(call2));
}

<CONSOLE>
010-1234-5678 : 윈터
010-1111-2222 : 지젤
```
get 메소드에 Key값을 넣어주면 Key값을 기반으로 Value를 찾아온다.
※Key값은 고유한 값! 중복이 안된다. 중복될 시 먼저 넣었던 Value 값을 잃게 됨 (덮어쓰기 느낌?)
-> Value는 중복이어도 됨.

### 이 외 HashMap에서 제공하는 여러 메소드!
 - size() : 저장된 키의 총 갯수 출력
 - containsKey(K) : 해당 키가 있는지 알려줌 [true, false]
 - containsValue(V) : 해당 값이 있는지 알려줌 [true, false]
 - remove(K) : 해당 키와 일치하는 엔트리 삭제
 - clear() : 내용 전체 삭제
 - isEmptry() : 값이 비어있는지 확인

