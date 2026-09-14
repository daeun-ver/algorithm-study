package programmers.step04_sql

/*
 * [테이블 구조]
 * - BOOK_ID        | INTEGER    | FALSE | 도서 ID (PK)
 * - CATEGORY       | VARCHAR(N) | FALSE | 카테고리 ('경제', '인문', '소설', '생활', '기술')
 * - AUTHOR_ID      | INTEGER    | FALSE | 저자 ID (FK)
 * - PRICE          | INTEGER    | FALSE | 판매가 (원)
 * - PUBLISHED_DATE | DATE       | FALSE | 출판일
 *
 * BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 도서 ID, 출판일을 출력하는 SQL문을 작성해주세요.
 * 결과는 출판일을 기준으로 오름차순 정렬해주세요.
 */

val query4 = """
    SELECT BOOK_ID, PUBLISHED_DATE
    FROM BOOK
    WHERE PUBLISHED_DATE >= '2021-01-01' AND PUBLISHED_DATE <= '2021-12-31' AND CATEGORY = '인문'
    ORDER BY PUBLISHED_DATE ASC;
    """.trimIndent()