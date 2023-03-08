package com.kh.ontrip.member.model.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String gender;
	private String phone;
	private String birthDate;
	private String status;
	private Date enrollDate;
	private Date modifyDate;

}
