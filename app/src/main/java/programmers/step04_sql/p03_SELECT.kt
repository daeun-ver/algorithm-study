package programmers.step04_sql

/*
 * [테이블 구조]
 * - SHIPMENT_ID | INT(N)      | FALSE
 * - FLAVOR      | VARCHAR(N)  | FALSE
 * - TOTAL_ORDER | INT(N)      | FALSE
 *
 * - FLAVOR          | VARCHAR(N)  | FALSE
 * - INGREDIENT_TYPE | VARCHAR(N)  | FALSE
 *
 * 상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.
 */

val query3 = """
    SELECT FIRST_HALF.FLAVOR
    FROM FIRST_HALF
    JOIN ICECREAM_INFO ON FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR
    WHERE TOTAL_ORDER > 3000 AND INGREDIENT_TYPE = 'fruit_based'
    ORDER BY TOTAL_ORDER DESC;
    """.trimIndent()