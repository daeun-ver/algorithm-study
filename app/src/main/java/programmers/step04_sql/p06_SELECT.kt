package programmers.step04_sql

/*
 * [테이블 구조]
 * - DR_NAME   | VARCHAR(20) | FALSE | 의사이름
 * - DR_ID     | VARCHAR(10) | FALSE | 의사ID (PK)
 * - LCNS_NO   | VARCHAR(30) | FALSE | 면허번호
 * - HIRE_YMD  | DATE        | FALSE | 고용일자
 * - MCDP_CD   | VARCHAR(6)  | TRUE  | 진료과코드 ('CS': 흉부외과, 'GS': 일반외과)
 * - TLNO      | VARCHAR(50) | TRUE  | 전화번호
 *
 * DOCTOR 테이블에서 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사ID, 진료과, 고용일자를 조회하는 SQL문을 작성해주세요.
 * 이때 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬해주세요.
 */

val query6 = """
    SELECT DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
    FROM DOCTOR
    WHERE MCDP_CD = 'CS' OR 'GS'
    ORDER BY HIRE_YMD DESC, DR_NAME ASC;
    """.trimIndent()