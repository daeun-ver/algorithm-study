package programmers.step04_sql

/*
 * [테이블 구조]
 * - WAREHOUSE_ID   | VARCHAR(10) | FALSE | 창고 ID (PK)
 * - WAREHOUSE_NAME | VARCHAR(20) | FALSE | 창고 이름
 * - ADDRESS        | VARCHAR(100)| TRUE  | 주소
 * - TLNO           | VARCHAR(20) | TRUE  | 전화번호
 * - FREEZER_YN     | VARCHAR(1)  | TRUE  | 냉동시설 여부
 *
 * FOOD_WAREHOUSE 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요.
 * 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.
 */

val query39 = """
    SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
    FROM FOOD_WAREHOUSE
    WHERE ADDRESS LIKE '경기도%'
    ORDER BY WAREHOUSE_ID;
    """.trimIndent()