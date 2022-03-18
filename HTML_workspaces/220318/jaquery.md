## ☆220318☆
---
* JS는 매개변수에 함수 사용 가능
익명함수 쓰는 이유 ~ 이름짓기 귀찮아서~

 ### on -> 함수 받을 준비!
 ### append 
    -> 부모태그에 정의하면 자식에 추가 됨
    -> 포스트잇과 비슷한 개념

    append to 라는 것도 있지만 잘 안씀
### children
    -> *부모기준 으로 자식 정보를 알고싶을 때
    -> '자식만'찾음 , 손자는 못찾음
    -> 손자를 찾고싶으면 부모에서 자식찾고 자식이 부모가 되어 다시 자식을 찾는다. or find를 사용!
### find 
```
    = 대대로 다 찾을 수 있음 (find&children 한 쌍)

var val = $(".item").children();이 되는 이유
-> children() 은 함수이기 때문에 리턴값이 있어서 변수지정 가능
```
---
```
파일 이름에 min이 오면 압축파일
```

```
function findItem(){
            var val = $(".row").children();
            console.log(val);
            //칠드런으로 자식 찾음
            var baby = $(".row").find(".baby");
            console.log(baby);
            //find로 2층 아래인 baby를 찾음.
        }
```

## index2
```
<body>
    <div class="container">
        <div class="row">
            <div class="item" onclick="getItem(1)"></div>
            <div class="item" onclick="getItem('2')"></div>
            <div class="item" onclick="getItem(3)"></div>
        </div>


    </div>
    
    <script>
        function getItem(num){
            if(num == 2){
                console.log("hello world")
            }
            console.log("hello world"+num)

        }
    </script>
</body>
```
```
1.위에서 div.row에서 두번째 getItem('2')가 되는이유는?
 -> 데이터타입이 없기때문에 실행가능!

2.script 태그에서 함수 실행문은 총 두개가 출력!
```
---

## 회원가입.html
    문자열이 가지고 있는 함수 trim,replace,substring ...
    trim >> 문자열 함수이고 자바스크립트에 내장함수.
    문자 자체가 함수를 가지고있음
    └> "라이츄".trim(); //가능
    userId에 공백이 들어올 시 trim() 혹은 replace(,) 으로 공백 제거
    내장함수!! (내가 정의하지 않았지만 사용할 수 있는 함수)
```
var userId = $("#userId").val().trim(); //메소드 체이닝!!(리턴값이 있는 함수만 가능) 모든 언어에서 사용하는 방법
```

정규표현식(Regular Expression)
: 문자열을 처리하는 방법









---
참고하면 좋을만한 사이트

https://araikuma.tistory.com/609

https://farcanada.tistory.com/entry/jQuery-%EC%9E%90%EC%A3%BC%EC%93%B0%EB%8A%94-%EC%A0%9C%EC%9D%B4%EC%BF%BC%EB%A6%AC-%ED%95%A8%EC%88%98-%EB%AA%A8%EC%9D%8C

    

