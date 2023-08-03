package com.edu.festivalproject.util;

import org.springframework.beans.factory.annotation.Value;

//축제 API요청하는 클래스
public class FestivalAPIManager {
    @Value("$(API-KEY)")
    private String apiKey="";

    String requestUrl=""; //서비스키 숨길 공간이 필요
    
    //API요청하기
}
