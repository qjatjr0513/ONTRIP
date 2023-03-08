package com.kh.ontrip.reservation.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Reservation {
	
    private Integer rnCode;
    private int placeCode; 
    private int memberNo; 
    private String rnName;; 
    private int rnAdult;
    private int rnChild; 
    private int rnCount; 
    private String rnRoomType;
    private String rnPhoneNumber;
    private Date rnCheckIn;
    private Date rnCheckOut;
    private Date rnDate;
    private String rnStatus;
	private Integer rnPrice;

	private String plcName;


}
