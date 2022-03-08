var name = "홍길동"
var age = 23;
// json
var information = {
    name : '홍길동',
    age : 23
};

console.log(information.age);

var dwAcademy ={
    students : ['양다은','류근환','이인서','나정수'],
    students_count : 15,
    teacher : '현상원',
    today : '2022-03-08',
    subject : ['SQL','JAVA','HTML']
};

console.log(dwAcademy.students[0]);
console.log(dwAcademy.students_count);

// 문제 1 . 카운트가 15이하면 학생 수 부족 15 초과면 학생 수  정상
var count = dwAcademy.students_count;
if(count<=15){
    console.log('부족');

}else {
    console.log('정상');
}


// 문제 2 . 학생 중 이씨 몇명인지 카운트
var count = 0;
var searchWord ='이';
for(i=0; i<dwAcademy.students.length; i++){
    var firstName = dwAcademy.students[i].substring(0,1);
    if(firstName == searchWord){
        ++count;
    }   
        }
console.log('이씨는 총'+count);

// --------------------------------------------------
var 사원 ={
    이름 : 'SMITH',
    사원ID : 3450,
    급여 : 3400,
    부서 : [{
        name : "개발",
        count : 5} ,'영업'],
    상사 : ['BRIAN','KING'],
    입사날짜 : '21-12-31'
}


