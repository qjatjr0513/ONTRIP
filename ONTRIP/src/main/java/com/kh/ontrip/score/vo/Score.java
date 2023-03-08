package com.kh.ontrip.score.vo;

import lombok.Data;

@Data
public class Score {
	
	private int scoreCode;
    private int reviewCode;
    private double reviewStar; 
    private double review_c;   
    private double review_s;   
    private double review_p;  
    private String memberId;
    private int memberNo;
    
}
