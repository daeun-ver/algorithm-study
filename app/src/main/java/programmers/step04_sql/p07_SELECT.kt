package programmers.step04_sql

/*
 * [테이블 구조]
 * - FACTORY_ID   | VARCHAR(10)  | FALSE | 공장 ID (PK)
 * - FACTORY_NAME | VARCHAR(50)  | FALSE | 공장 이름
 * - ADDRESS      | VARCHAR(100) | FALSE | 주소
 * - TLNO         | VARCHAR(20)  | TRUE  | 전화번호
 *
 * FOOD_FACTORY 테이블에서 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL문을 작성해주세요.
 * 이때 결과는 공장 ID를 기준으로 오름차순 정렬해주세요.
 */

val query7 = """
    SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID ASC;
    """.trimIndent()