```
이클립스 설치 할 때 EE, SE가 있는데 
자바만 하고싶으면 SE , 스프링 자바 등을 사용하고 싶으면 EE를 사용.

EE를 사용하면 스프링을 설치 안해도 됨.
SE 설치했으면 install software에서 스프링을 따로 설치해줘야 함.

File -> import -> Gradle or Maven (회사에서 사용하는 것)


스프링으로 개발 하고 다른 컴퓨터로 받고싶으면
깃허브 풀, 클론 받으면 import 해줘야함.
```
======= 
```
rm: cannot remove '/etc/post-install/01-devices.post': Permission denied
rm: cannot remove '/etc/post-install/03-mtab.post': Permission denied
rm: cannot remove '/etc/post-install/06-windows-files.post': Permission denied
rm: cannot remove '/etc/post-install/99-post-install-cleanup.post': Permission denied

dw-014@DESKTOP-1FUQNT1 MINGW64 ~
$ git init
Initialized empty Git repository in C:/Users/dw-014/.git/

dw-014@DESKTOP-1FUQNT1 MINGW64 ~ (master)
$


```
```
1. git init
2. 본인 깃허브 접속
3. 깃허브에서 new 레파지토리 생성
4. 생성하면 나오는 create a new repository on the command line 한 줄씩 다 추가
5. 
다 하면 File -> import -> Gradle -> 코끼리 next -> MY_SPRING(본인폴더) finish ->

임포트 후 X표시 날 경우
새로만든 폴더에 setting 코끼리에서 루트프로젝트 이름 바꿔주세요
그리고 프로젝트 우클릭 후 gradle -> refresh
```
```
컨트롤러에서 요청을 받고 서비스로 보냄
서비스에서 처리하는 로직 -> 비즈니스 로직

vo에는 getter,setter & 생성자 !
getter setter & 생성자는 lombok을 통해 생성했었다~
```

