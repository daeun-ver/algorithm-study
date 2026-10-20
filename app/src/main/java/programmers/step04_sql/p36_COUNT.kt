package programmers.step04_sql

/*
 * [테이블 구조]
 * - ANIMAL_ID        | VARCHAR(N)  | FALSE | 동물 ID (PK)
 * - ANIMAL_TYPE      | VARCHAR(N)  | FALSE | 생물 종
 * - DATETIME         | DATETIME    | FALSE | 보호 시작일
 * - INTAKE_CONDITION | VARCHAR(N)  | FALSE | 상태 (Normal, Sick 등)
 * - NAME             | VARCHAR(N)  | TRUE  | 이름 (NULL 허용)
 * - SEX_UPON_INTAKE  | VARCHAR(N)  | FALSE | 성별 및 중성화 여부
 *
 * 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성해주세요. 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
 */

val query36 = """
    SELECT COUNT(DISTINCT NAME)
    FROM ANIMAL_INS
    WHERE NAME IS NOT NULL;
    """.trimIndent()