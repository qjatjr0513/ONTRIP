package com.kh.ontrip.review.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {
	
	private int revCode;
	private int plcCode;
	private String memberId;
	private String memberName;
	private int memberNo;
	private Date revDate;
	private String revText;
	private String status;
	private Date revChangeDate;
	private String categoryName;
	private String placeName;
	private int reviewStar;
	private int review_c;      
    private int review_s;      
    private int review_p;

}
