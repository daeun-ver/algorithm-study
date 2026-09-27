package programmers.step04_sql

/*
 * [테이블 구조]
 * - USER_ID  | INTEGER    | FALSE | 회원 ID (PK)
 * - GENDER   | TINYINT(1) | TRUE  | 성별 (NULL, 0: 남자, 1: 여자)
 * - AGE      | INTEGER    | TRUE  | 나이
 * - JOINED   | DATE       | FALSE | 가입일
 *
 * USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.
 */

val query16 = """
    SELECT COUNT(*) AS USERS
    FROM USER_INFO
    WHERE JOINED LIKE '2021%' AND AGE BETWEEN 20 AND 29;
    """.trimIndent()