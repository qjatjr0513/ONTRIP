package com.kh.ontrip.question.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Question {

    private Integer qCode;
	// �꽦�슦  , Integer���엯 蹂�寃�
	private int memNo;
	private String qTitle;
	private String qContent;
	private Date qDate;
	private String aContent;
	private Integer qCount;
	private String status;
	
}
