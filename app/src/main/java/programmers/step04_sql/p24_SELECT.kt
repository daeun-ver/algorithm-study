package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID         | VARCHAR(N) | FALSE | 개발자 ID (PK)
 * - FIRST_NAME | VARCHAR(N) | TRUE  | 이름
 * - LAST_NAME  | VARCHAR(N) | TRUE  | 성
 * - EMAIL      | VARCHAR(N) | FALSE | 이메일
 * - SKILL_CODE | INTEGER    | FALSE | 보유한 스킬코드 (비트마스크)
 *
 * - NAME     | VARCHAR(N) | FALSE | 스킬 이름 ('Python', 'C#' 등)
 * - CATEGORY | VARCHAR(N) | FALSE | 스킬 카테고리
 * - CODE     | INTEGER    | FALSE | 스킬 코드 (2의 거듭제곱 비트값)
 *
 * DEVELOPERS 테이블에서 Python이나 C# 스킬을 가진 개발자의 정보를 조회하려 합니다. 조건에 맞는 개발자의 ID, 이메일, 이름, 성을 조회하는 SQL 문을 작성해 주세요.
 * 결과는 ID를 기준으로 오름차순 정렬해 주세요.
 */

val query24 = """
    SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
    FROM DEVELOPERS D
    JOIN SKILLCODES S ON (D.SKILL_CODE & S.CODE) = S.CODE
    WHERE S.NAME IN ('Python', 'C#')
    ORDER BY D.ID;
    """.trimIndent()