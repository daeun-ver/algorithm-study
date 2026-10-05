package programmers.step04_sql

/*
 * [테이블 구조]
 * - ONLINE_SALE_ID | INTEGER | FALSE | 온라인 상품 판매 ID (PK)
 * - USER_ID        | INTEGER | FALSE | 회원 ID
 * - PRODUCT_ID     | INTEGER | FALSE | 상품 ID
 * - SALES_AMOUNT   | INTEGER | FALSE | 판매 수량
 * - SALES_DATE     | DATE    | FALSE | 판매일
 *
 * ONLINE_SALE 테이블에서 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문을 작성해주세요.
 * 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬해주세요.
 */

val query22 = """
    SELECT USER_ID, PRODUCT_ID
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
    HAVING COUNT(*) >= 2
    ORDER BY USER_ID, PRODUCT_ID DESC;
    """.trimIndent()