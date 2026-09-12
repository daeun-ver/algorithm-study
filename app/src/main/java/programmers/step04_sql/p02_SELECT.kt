package programmers.step04_sql

/*
 * [테이블 구조]
 * - SHIPMENT_ID | INT(N)      | FALSE
 * - FLAVOR      | VARCHAR(N)  | FALSE
 * - TOTAL_ORDER | INT(N)      | FALSE
 *
 * 상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.
 */

val query2 = """
    SELECT FLAVOR
    FROM FIRST_HALF
    ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;
    """.trimIndent()