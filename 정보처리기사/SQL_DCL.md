## Part 8. 03 SQL 정의어 DCL

### COMMIT & ROLLBACK
    COMMIT : DB연산이 성공적으로 종료되어 연산에 의한 수정내용을 지속적으로 유지하기 위한 명령어

    ROLLBACK : DB내의 연산이 비정상적으로 종료되거나 정상적으로 수행이 되었다 하더라도 수행되기 이전 상태로 되돌리기 위해 연산 내용을 취소할 때 사용하는 명령어 (이전 커밋으로 돌아감)

### GRANT & REVOKE
    GRANT : 관리자가 사용자에게 DB 권한을 부여하기 위한 명령어
    
    GRANT 권한 내용 ON 테이블_이름 TO 사용자 [ WITH GRANT OPTION ];
    [ WITH GRANT OPTION ]: 사용자가 관리자로부터 부여받은 권한을 다른 사용자에게 부여할 수 있는 권한 부여권까지 부여하고자 할 때 사용하는 옵션


    REVOKE : 관리자가 사용자에게 부여했던 권한을 취소하기 위해 사용

    REVOKE 권한 내용 ON 테이블_이름 FROM 사용자 [CASCADE];
    [CASCADE]:사용자가 다른 사용자에게 권한을 부여했을 경우 그 사용자의 권한도 삭제