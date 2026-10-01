package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID           | INTEGER | FALSE | 대장균 개체 ID (PK)
 * - PARENT_ID    | INTEGER | TRUE  | 부모 개체 ID
 * - SIZE_OF_COLONY | INTEGER | FALSE | 개체 크기
 * - DIFFERENTIATION_DATE | DATE | FALSE | 분화 날짜
 * - GENOTYPE     | INTEGER | FALSE | 개체 유전자형 (비트마스크)
 *
 * 2번 형질이 보유하지 않으면서 1번이나 3번 형질을 보유하고 있는 대장균 개체의 수(COUNT)를 출력하는 SQL 문을 작성해주세요.
 * 1번과 3번 형질을 모두 보유하고 있는 경우도 1번이나 3번 형질을 보유하고 있는 경우에 포함합니다.
 */

val query20 = """
    SELECT COUNT(*)
    FROM ECOLI_DATA
    WHERE (GENOTYPE & 2) = 0 AND (GENOTYPE & 5) > 0;
    """.trimIndent()