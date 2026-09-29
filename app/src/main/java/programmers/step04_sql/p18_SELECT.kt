package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID        | INTEGER | FALSE | 물고기 ID (PK)
 * - FISH_TYPE | INTEGER | FALSE | 물고기 종류 ID
 * - LENGTH    | FLOAT   | TRUE  | 잡은 물고기의 길이 (cm, NULL 가능)
 * - TIME      | DATE    | FALSE | 잡은 날짜
 *
 * 잡은 물고기 중 길이가 10cm 이하인 물고기의 수를 출력하는 SQL 문을 작성해주세요.
 * 물고기의 수를 나타내는 컬럼 명은 FISH_COUNT로 해주세요.
 */

val query18 = """
    SELECT COUNT(*) AS FISH_COUNT
    FROM FISH_INFO
    WHERE LENGTH IS NULL;
    """.trimIndent()