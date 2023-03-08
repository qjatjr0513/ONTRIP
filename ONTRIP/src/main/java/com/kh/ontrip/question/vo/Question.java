package com.kh.ontrip.question.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Question {

    private Integer qCode;
	private int memNo;
	private String qTitle;
	private String qContent;
	private Date qDate;
	private String aContent;
	private Integer qCount;
	private String status;
	
}
