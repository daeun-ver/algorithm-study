package programmers.step04_sql

/*
 * [테이블 구조]
 * - MEMBER_ID     | VARCHAR(100) | FALSE | 회원 ID (PK)
 * - MEMBER_NAME   | VARCHAR(50)  | FALSE | 회원 이름
 * - TLNO          | VARCHAR(50)  | TRUE  | 전화번호
 * - GENDER        | VARCHAR(1)   | TRUE  | 성별 ('W': 여성, 'M': 남성)
 * - DATE_OF_BIRTH | DATE         | TRUE  | 생년월일
 *
 * MEMBER_PROFILE 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL문을 작성해주세요.
 * 이때 전화번호가 NULL인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원ID를 기준으로 오름차순 정렬해주세요.
 */

val query21 = """
    SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_OF_BIRTH
    FROM MEMBER_PROFILE
    WHERE DATE_OF_BIRTH LIKE '%-03-%' 
    AND TLNO IS NOT NULL
    AND GENDER = 'W'
    ORDER BY MEMBER_ID;
    """.trimIndent()