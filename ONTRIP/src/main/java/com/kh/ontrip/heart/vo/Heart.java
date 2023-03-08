package com.kh.ontrip.heart.vo;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Heart {
	

	private int memberNo; // �쉶�썝踰덊샇 (PK) // SQL : MEM_NO2    // VARCHAR2(20)
    private int plcCode;   // �떆�꽕肄붾뱶 (FK) // SQL : PLC_CODE   // VARCHAR2(20)
    private Date heartDate; // 李쒗븳�궇吏�      // SQL : HEART_DATE // VARCHAR2(20)
    private String categoryName;
    private String placeName;
    private String filePath;
    private String originName;
    private String changeName;
}
