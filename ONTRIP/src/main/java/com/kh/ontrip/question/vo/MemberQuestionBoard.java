package com.kh.ontrip.question.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberQuestionBoard {

    private int qCode;
    private String qTitle ;
    private String aContent;
    private Date qDate;
    private String memName;
    private int memNum;

}
