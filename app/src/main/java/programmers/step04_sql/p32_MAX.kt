package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID        | INTEGER | FALSE | 잡은 물고기의 ID (PK)
 * - FISH_TYPE | INTEGER | FALSE | 물고기의 종류 (FK)
 * - LENGTH    | FLOAT   | TRUE  | 잡은 물고기의 길이 (cm, NULL 가능)
 * - TIME      | DATE    | FALSE | 물고기를 잡은 날짜
 *
 * FISH_INFO 테이블에서 잡은 물고기 중 가장 큰 물고기의 길이를 'cm' 를 붙여 출력하는 SQL 문을 작성해주세요.
 * 이 때 컬럼명은 'MAX_LENGTH' 로 지정해주세요.
 */

val query32 = """
    SELECT CONCAT(MAX(LENGTH), 'cm') AS MAX_LENGTH
    FROM FISH_INFO
    """.trimIndent()