package com.kh.ontrip.score.vo;

import lombok.Data;

@Data
public class Score {
	
	private int scoreCode;
    private int reviewCode; // �썑湲곗퐫�뱶(PK)  // SQL : REV_CODE // VARCHAR2(20)
    private double reviewStar;    // 留뚯”�룄        // SQL : REV_STAR // VARCHAR2(20)
    private double review_c;      // 泥�寃�          // SQL : REV_C    // VARCHAR2(20)
    private double review_s;      // �꽌鍮꾩뒪        // SQL : REV_S    // VARCHAR2(20)
    private double review_p;      // �렪�쓽          // SQL : REV_P    // VARCHAR2(20)
    private String memberId;
    private int memberNo;
    
}
