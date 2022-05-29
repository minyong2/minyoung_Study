## Part 8. 02 SQL 정의어 DML
    SELECT , INSERT, UPDATE, DELETE

### SELECT 
    원하는 자료 조회(검색)

    SELECT [DISTINCT] 속성_이름
    FROM 테이블_이름
    [WHERE 조건]
    [GROUP BY 속성_이름 [HAVING 그룹조건]]
    [ORDER BY 속성_이름 [ASC|DESC]];

    DISTINCT : 검색 결과에 중복되는 값이 있는 경우 한 번만 표현하도록 하는 옵션, 생략 시 중복된 값이 모두 표시된다.

    
    *함수를 이용한 검색문
    SUM(속성_이름),AVG(속성_이름),MAX(속성_이름),MIN(속성_이름),COUNT(속성_이름)

    *부속(하위) 질의문
    질의문 안에 또 하나의 질의문
    처음 나오는 질의문이 메인 질의문 , 두번째 나오는 질의문을 부속(하위) 질의문
    SELECT 학생수
    FROM 학과인원
    WHERE 학과 =
        (SELECT 학과
         FROM 학생정보
         WEHRE 이름 = '김민영')

         =>김민영이 속한 학과의 학생수

    *부분 매치 질의문
    조건문 작성 시 문자형 자료의 일부를 가지고 비교하여 검색
    '%' 는 여러문자를 대신, '_' 한자리를 대신
    '=' 대신 'LIKE'를 이용
    SELECT 성명
    FROM 학생
    WHERE 연락처 LIKE '%2530';

### INSERT
    기존 테이블에 새로운 데이터를 삽입
    INSERT INTO 테이블_이름[(속성이름),...]
    VALUE (속성값...);

### UPDATE
    테이블의 데이터 값 변경
    UPDATE 테이블_이름
    SET 속성_이름 = 변경내용
    [WEHRE 조건];

### DELETE
    테이블의 자료(행)를 삭제할 경우 사용
    WHERE절에 맞는 행만 삭제되며 WHERE절이 생략된 경우 모든 행이 삭제되어 빈 테이블이 된다.

    DELETE FROM 테이블_이름
    [WHERE 조건];

    *테이블을 삭제하고싶은 경우 DROP을 사용해라.
