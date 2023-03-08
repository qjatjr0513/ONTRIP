package com.kh.ontrip.reservation.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Reservation {
	
    private Integer rnCode; //�삁�빟 肄붾뱶
    private int placeCode; // �떆�꽕 肄붾뱶
    private int memberNo; // �쉶�썝 踰덊샇
    private String rnName;; // �삁�빟�옄 紐�
    private int rnAdult; // �씤�썝(�꽦�씤) �닔
    private int rnChild; // �씤�썝(�뼱由곗씠) �닔
    private int rnCount; // 媛앹떎 �닔
    private String rnRoomType; // 媛앹떎���엯
    private String rnPhoneNumber; // �삁�빟�옄 �쑕���룿 踰덊샇
    private java.sql.Date rnCheckIn; // 泥댄겕�씤 �궇吏�
    private java.sql.Date rnCheckOut; // 泥댄겕�븘�썐 �궇吏�
    private java.sql.Date rnDate; // �삁�빟�븳 �궇吏�
    private String rnStatus; // �궘�젣 �뿬遺�(N, Y)
	private Integer rnPrice;

	private String plcName;


	//寃곗젣�닔�떒 , 寃곗젣�젙蹂� , 移댄뀒怨좊━肄붾뱶  �궘�젣


}
