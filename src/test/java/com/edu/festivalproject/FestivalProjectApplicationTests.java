package com.edu.festivalproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;

@SpringBootTest
class FestivalProjectApplicationTests {

	@Test
	void contextLoads() {
        System.out.print();
        System.out.print("hi");
        System.out.println();

	}

    @Test
    void adminTest(){
        System.out.print();
        System.out.println();
        System.out.print();
        BufferedReader br = new BufferedReader(new InputstreamReader(System.in));
       br.readline();
 }
    
    //Member 테스트
    @Test
    void memberTest(){
        System.out.print();
        System.out.print();
        System.out.print();
    }
    
    //축제API 테스트
    @Test
    void festivalTest(){
        System.out.print();
        System.out.println();
    }

}
