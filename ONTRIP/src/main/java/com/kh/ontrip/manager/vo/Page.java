package com.kh.ontrip.manager.vo;

import lombok.Data;

@Data
public class Page {

    private int startPage ; //게시글 회면 첫번째 번호
    private int endPage;  //게시글 회면  마지막 번호

    private boolean prev , next;

    private int pageNum; //현재 조회하는 페이지번호
    private int amount ; // 회면 (게시글) 데이터수
    private int total; //전체게시글수
}
