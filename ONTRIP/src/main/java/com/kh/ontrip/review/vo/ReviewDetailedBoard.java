package com.kh.ontrip.review.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewDetailedBoard {

    private String plcName;
    private String memName;
    private Date revDate;
    private String revText;
    private int revStar;
    private int revC;
    private int revS;
    private int revP;
    private String categoryCode;

}
