package programmers.step04_sql

/*
 * [테이블 구조]
 * - USER_ID  | INTEGER    | FALSE | 회원 ID (PK)
 * - GENDER   | TINYINT(1) | TRUE  | 성별 (NULL, 0: 남자, 1: 여자)
 * - AGE      | INTEGER    | TRUE  | 나이
 * - JOINED   | DATE       | FALSE | 가입일
 *
 * USER_INFO 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 USERS로 지정해주세요.
 */

val query42 = """
    SELECT COUNT(*) AS USERS
    FROM USER_INFO
    WHERE AGE IS NULL;
    """.trimIndent()