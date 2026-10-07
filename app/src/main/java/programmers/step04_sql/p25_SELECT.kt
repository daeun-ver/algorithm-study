package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID        | INTEGER | FALSE | 잡은 물고기의 ID (PK)
 * - FISH_TYPE | INTEGER | FALSE | 물고기의 종류 (FK)
 * - LENGTH    | FLOAT   | TRUE  | 잡은 물고기의 길이 (cm, NULL 가능)
 * - TIME      | DATE    | FALSE | 물고기를 잡은 날짜
 *
 * - FISH_TYPE | INTEGER | FALSE | 물고기의 종류 (PK)
 * - FISH_NAME | VARCHAR | FALSE | 물고기의 이름
 *
 * FISH_INFO 테이블에서 잡은 BASS와 SNAPPER의 수를 출력하는 SQL 문을 작성해주세요.
 * 컬럼명은 'FISH_COUNT`로 해주세요.
 */

val query25 = """
    SELECT COUNT(*) AS FISH_COUNT
    FROM FISH_INFO F
    JOIN FISH_NAME_INFO N ON N.FISH_TYPE = F.FISH_TYPE
    WHERE N.FISH_NAME IN ('BASS', 'SNAPPER')
    """.trimIndent()