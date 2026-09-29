package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID         | VARCHAR(N) | FALSE | 개발자 ID (PK)
 * - FIRST_NAME | VARCHAR(N) | TRUE  | 이름
 * - LAST_NAME  | VARCHAR(N) | TRUE  | 성
 * - EMAIL      | VARCHAR(N) | FALSE | 이메일
 * - SKILL_1    | VARCHAR(N) | TRUE  | 스킬 1
 * - SKILL_2    | VARCHAR(N) | TRUE  | 스킬 2
 * - SKILL_3    | VARCHAR(N) | TRUE  | 스킬 3
 *
 * Python 스킬을 가진 개발자의 ID, 이메일, 이름, 성을 조회하는 SQL 문을 작성해 주세요.
 * 결과는 ID를 기준으로 오름차순 정렬해 주세요.
 */

val query17 = """
    SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
    FROM DEVELOPER_INFOS
    WHERE SKILL_1 = 'Python' OR SKILL_2 = 'Python' OR SKILL_3 = 'Python'
    ORDER BY ID;
    """.trimIndent()