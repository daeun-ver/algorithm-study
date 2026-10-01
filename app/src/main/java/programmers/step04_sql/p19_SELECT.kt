package programmers.step04_sql

/*
 * [테이블 구조]
 * - ID        | INTEGER | FALSE | 물고기 ID (PK)
 * - FISH_TYPE | INTEGER | FALSE | 물고기 종류 ID
 * - LENGTH    | FLOAT   | TRUE  | 잡은 물고기의 길이 (cm, NULL 가능)
 * - TIME      | DATE    | FALSE | 잡은 날짜
 *
 * FISH_INFO 테이블에서 가장 큰 물고기 10마리의 ID와 길이를 출력하는 SQL 문을 작성해주세요.
 * 결과는 길이를 기준으로 내림차순 정렬하고, 길이가 같다면 물고기의 ID에 대해 오름차순 정렬해주세요. 단, 가장 큰 물고기 10마리 중 길이가 10cm 이하인 경우는 없습니다.
 */

val query19 = """
    SELECT ID, LENGTH
    FROM FISH_INFO
    ORDER BY LENGTH DESC, ID
    LIMIT 10;
    """.trimIndent()