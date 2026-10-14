package programmers.step04_sql

/*
 * [테이블 구조]
 * - PRODUCT_ID   | INTEGER     | FALSE | 상품 ID (PK)
 * - PRODUCT_CODE | VARCHAR(8)  | FALSE | 상품코드 (앞 2자리 카테고리 등)
 * - PRICE        | INTEGER     | FALSE | 상품 가격
 *
 * PRODUCT 테이블에서 판매 중인 상품 중 가장 높은 판매가를 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 MAX_PRICE로 지정해주세요.
 */

val query30 = """
    SELECT MAX(PRICE) AS MAX_PRICE
    FROM PRODUCT
    """.trimIndent()