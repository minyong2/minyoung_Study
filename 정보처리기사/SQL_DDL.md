  ## Part 8. 01 SQL 정의어 DDL
    CREATE,ALTER,DROP

### CREATE
    테이블, 스키마, 도메인, 인덱스, 뷰 등을 정의하기 위해 사용하는 명령문이다.

```
구문
CREATE TABLE 테이블_이름
({속성_이름 데이터_타입 [NOT NULL],}
[PRIMARY KEY(속성_이름),]
[UNIQUE(속성_이름),]
[FOREIGN KEY(속성_이름) REFERENCES 참조테이블_이름(속성_이름)]
 [ON DELETE CASCADE | SET NULL | SET DEFAULT | NO ACTION]
 [ON UPDATE CASCADE | SET NULL | SET DEFAULT | NO ACTION],
[CONSTRAINT 제약조건_이름 CHECK(속성_이름=범위 값)]
);

위 구문 설명
{} 반복 , [] 생략가능 , | 선택

{속성_이름 데이터_타입 [NOT NULL]} : 테이블을 구성 할 속성 이름, 데이터 타입 기입과 {}가 반복의 의미임으로 테이블을 구성할 속성 수만큼 반복

[NOT NULL] : NULL이 없도록 지정

PRIMARY KEY : 테이블의 기본 키
UNIQUE(속성_이름) : 중복된 값이 없도록 하며 , 모든 속성값이 고유한 값을 가지도록 지정

FOREIGN KEY(속성_이름) REFERENCES 참조테이블_이름(속성_이름) : 외래키를 지정할 때 사용된다.

[CONSTRAINT 제약조건_이름 CHECK(속성_이름=범위 값)] : 테이블을 생성할 때 특정 속성에 대해 속성값의 범위를 지정할 때 사용된다.
```

### 스키마
    시스템 관리자가 일반 사용자에게 스키마에 대한 권한을 주기 위한 스키마를 만들기 위해 사용
    CREATE SCHEMA 스키마_이름 AUTHORIZATION 사용자;

    ★도메인 정의
    한 속성값의 범위를 지정하기 위한 도메인은 CREATE DOMAIN문에 의해 생성되며, 다음과 같은 구문에 따라 만들어진다.

    CREATE DOMAIN 도메인_이름 데이터_타입
     [DEFAULT 기본값]
     [CONSTRAINT 제약조건_이름 CHECK(VALUE IN(범위 값))];

    ★인덱스 정의
    효율적 검색을 위함, 세스템에 의해 자동 관리된다

    CREATE [UNIQUE] INDEX 인덱스_이름
     ON 테이블_이름(속성_이름 [ASC|DESC])
     [CLUSTER];

     CLUSTER : 인접된 튜플들을 물리적인 그룹으로 묶어 저장하도록 할 때 사용된다.

### ALTER
    기존에 만들어진 테이블에 새로운 속성 추가, 기존 속성 변경 OR 삭제할 때 사용

    ALTER TABLE 테이블 이름 ADD 속성_이름 데이터_타입 [DEFAULT];
    => 기존 테이블에 새로운 속성을 추가할 때 사용되는 구문이다.
    ALTER TABLE 테이블 이름 ALTER 속성_이름 데이터_타입 [SET DEFAULT];
    => 기존 테이블의 속성에 대한 사항을 변경할 때 사용되는 구문이다.
    (오라클의 경우 ALTER TABLE ~ MODIFY)
    ALTER TABLE 테이블 이름 DROP 속성_이름 데이터_타입 [CASCADE | RESTRICT];
    => 기존 테이블에서 속성(항목)을 제거할 때 사용되는 구문이다.

### DROP
    기존에 사용되던 테이블, 스미카, 도메인, 인덱스, 뷰, 제약조건 등을 제거할 때 사용하는 명령으로 석제 시 테이블 전체가 제거된다.

    DROP TABLE 테이블_이름 [CASCADE | RESTRICT];
    DROP SCHEMA 스키마_이름 [CASCADE | RESTRICT];
    DROP DOMAIN 도메인_이름 [CASCADE | RESTRICT];
    DROP VIEW 뷰_이름 [CASCADE | RESTRICT];
    DROP INDEX 인덱스_이름;
    DROP CONSTRAINT 제약조건_이름;

    * RESTRICT : 삭제할 요소가 사용(참조) 중이면 삭제가 이루어지지 않는다.
    * CASCADE : 알지?

