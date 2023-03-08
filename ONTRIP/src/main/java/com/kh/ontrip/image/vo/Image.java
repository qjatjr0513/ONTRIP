package com.kh.ontrip.image.vo;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Image {

    private int fileNo; 
    private int plcCode; 
    private String originName;
    private String changeName;
    private String filePath; 
    private Date uploadDate; 
    private int fileLevel; 
    private String iStatus; 
    private String localCode;
    private String categoryCode;
    private String dareaCode; 

}
