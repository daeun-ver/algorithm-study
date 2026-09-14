package programmers.step04_sql

/*
 * [테이블 구조]
 * - PT_NO    | VARCHAR(10) | FALSE
 * - PT_NAME  | VARCHAR(20) | FALSE
 * - GEND_CD  | VARCHAR(1)  | FALSE
 * - AGE      | INTEGER     | FALSE
 * - TLNO     | VARCHAR(50) | TRUE
 *
 * PATIENT 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성해주세요.
 * 이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.
 */

val query5 = """
    SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE')
    FROM PATIENT
    WHERE AGE <= 12 AND GEND_CD = 'W'
    ORDER BY AGE DESC, PT_NAME ASC;
    """.trimIndent()