package com.dailycodework.lakesidehotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LakeSideHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(LakeSideHotelApplication.class, args);
    }

}
