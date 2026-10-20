package programmers.step04_sql

/*
 * [테이블 구조]
 * - PRODUCT_ID   | VARCHAR(10) | FALSE | 상품 ID (PK)
 * - PRODUCT_NAME | VARCHAR(50) | FALSE | 상품 이름
 * - PRODUCT_CD   | VARCHAR(10) | TRUE  | 상품 코드 (NULL 가능)
 * - CATEGORY     | VARCHAR(10) | TRUE  | 카테고리 (NULL 가능)
 * - PRICE        | NUMBER      | TRUE  | 상품 가격 (NULL 가능)
 *
 * FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL문을 작성해주세요.
 */

val query35 = """
    SELECT *
    FROM FOOD_PRODUCT
    WHERE PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT);
    """.trimIndent()