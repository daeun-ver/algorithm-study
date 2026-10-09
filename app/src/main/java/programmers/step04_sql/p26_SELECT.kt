package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID                   | INTEGER | FALSE | 대장균 개체 ID (PK)
 * - PARENT_ID            | INTEGER | TRUE  | 부모 대장균 ID (FK, NULL 가능)
 * - SIZE_OF_COLONY       | INTEGER | FALSE | 개체군 크기
 * - DIFFERENTIATION_DATE | DATE    | FALSE | 분화 날짜
 * - GENOTYPE             | INTEGER | FALSE | 개체 형질
 *
 * 부모의 형질을 모두 보유한 대장균의 ID(ID), 대장균의 형질(GENOTYPE), 부모 대장균의 형질(PARENT_GENOTYPE)을 출력하는 SQL 문을 작성해주세요.
 * 이때 결과는 ID에 대해 오름차순 정렬해주세요.
 */

val query26 = """
    SELECT C.ID, C.GENOTYPE, P.GENOTYPE AS PARENT_GENOTYPE
    FROM ECOLI_DATA C
    JOIN ECOLI_DATA P ON C.PARENT_ID = P.ID
    WHERE (C.GENOTYPE & P.GENOTYPE) = P.GENOTYPE
    ORDER BY C.ID ASC;
    """.trimIndent()