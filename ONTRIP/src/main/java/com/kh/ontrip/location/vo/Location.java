
package com.kh.ontrip.location.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Location {
	
    private String localCode;
    private String localName; 
    private String localText; 
   
}
