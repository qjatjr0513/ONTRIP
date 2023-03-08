package com.kh.ontrip.qna.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Qna {

	private Integer qaCode;
	private String qaQuestion;
	private String qaAnswer;
	private String qaCategory;
	private Date qaUploadDate;
	private Date qaChangeDate;
	private String statue;

}
