package com.kh.ontrip.review.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewBoard {

    private int revCode ;
    private String plcName ;
    private String memName ;
    private Date rnDate ;
    private String category;

}
