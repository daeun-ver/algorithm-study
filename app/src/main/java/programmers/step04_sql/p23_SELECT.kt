package programmers.step04_sql

/*
 * [테이블 구조]
 * - ITEM_ID   | INTEGER     | FALSE | 아이템 ID (PK)
 * - ITEM_NAME | VARCHAR(N)  | FALSE | 아이템 명
 * - RARITY    | VARCHAR(N)  | FALSE | 아이템 희귀도
 * - PRICE     | INTEGER     | FALSE | 아이템 가격
 *
 * - ITEM_ID        | INTEGER | FALSE | 아이템 ID (PK, 자식 아이템)
 * - PARENT_ITEM_ID | INTEGER | TRUE  | 부모 아이템 ID (NULL 가능)
 *
 * 아이템의 희귀도가 'RARE'인 아이템들의 모든 다음 업그레이드 아이템의 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME), 아이템의 희귀도(RARITY)를 출력하는 SQL 문을 작성해 주세요.
 * 이때 결과는 아이템 ID를 기준으로 내림차순 정렬주세요.
 */

val query23 = """
    SELECT I.ITEM_ID, I.ITEM_NAME, I.RARITY
    FROM ITEM_INFO I
    JOIN ITEM_TREE T ON I.ITEM_ID = T.ITEM_ID
    JOIN ITEM_INFO P ON T.PARENT_ITEM_ID = P.ITEM_ID
    WHERE P.RARITY = 'RARE'
    ORDER BY I.ITEM_ID DESC;
    """.trimIndent()