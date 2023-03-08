
package com.kh.ontrip.heart.vo;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Heart {
	
	  private int memberNo;
    private int plcCode; 
    private Date heartDate; 
    private String categoryName;
    private String placeName;
    private String filePath;
    private String originName;
    private String changeName;

}
