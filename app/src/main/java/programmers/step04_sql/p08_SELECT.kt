package programmers.step04_sql

/*
 * [테이블 구조]
* - BOARD_ID     | VARCHAR(5)    | FALSE | 게시글 ID (PK)
 * - WRITER_ID    | VARCHAR(50)   | FALSE | 작성자 ID
 * - TITLE        | VARCHAR(100)  | FALSE | 게시글 제목
 * - CONTENTS     | VARCHAR(1000) | FALSE | 게시글 내용
 * - PRICE        | NUMBER        | FALSE | 가격
 * - CREATED_DATE | DATE          | FALSE | 게시글 작성일
 * - STATUS       | VARCHAR(10)   | FALSE | 거래 상태
 * - VIEWS        | NUMBER        | FALSE | 조회수
 *
 * - REPLY_ID     | VARCHAR(10)   | FALSE | 댓글 ID (PK)
 * - BOARD_ID     | VARCHAR(5)    | FALSE | 게시글 ID (FK)
 * - WRITER_ID    | VARCHAR(50)   | FALSE | 작성자 ID
 * - CONTENTS     | VARCHAR(1000) | TRUE  | 댓글 내용
 * - CREATED_DATE | DATE          | FALSE | 댓글 작성일
 *
 * USED_GOODS_BOARD와 USED_GOODS_REPLY 테이블에서 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회하는 SQL문을 작성해주세요.
 * 결과는 댓글 작성일을 기준으로 오름차순 정렬해주시고, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬해주세요.
 */

val query8 = """
    SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, R.CREATED_DATE
    FROM USED_GOODS_BOARD B
    JOIN USED_GOODS_REPLY R ON B.BOARD_ID = R.BOARD_ID
    WHERE B.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'
    ORDER BY R.CREATED_DATE ASC , B.TITLE ASC;
    """.trimIndent()