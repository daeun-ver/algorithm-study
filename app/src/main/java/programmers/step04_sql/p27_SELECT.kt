package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID                   | INTEGER | FALSE | 대장균 개체 ID (PK)
 * - PARENT_ID            | INTEGER | TRUE  | 부모 대장균 ID (FK, NULL 가능)
 * - SIZE_OF_COLONY       | INTEGER | FALSE | 개체군 크기
 * - DIFFERENTIATION_DATE | DATE    | FALSE | 분화 날짜
 * - GENOTYPE             | INTEGER | FALSE | 개체 형질
 *
 * 대장균 개체의 ID(ID)와 자식의 수(CHILD_COUNT)를 출력하는 SQL 문을 작성해주세요.
 * 자식이 없다면 자식의 수는 0으로 출력해주세요. 이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요.
 */

val query27 = """
    SELECT P.ID, IFNULL(COUNT(C.ID), 0) AS CHILD_COUNT
    FROM ECOLI_DATA P
    LEFT JOIN ECOLI_DATA C ON C.PARENT_ID = P.ID
    GROUP BY P.ID
    ORDER BY P.ID;
    """.trimIndent()