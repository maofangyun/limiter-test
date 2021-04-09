package com.test;

import com.mfy.annotation.EasyCache;
import org.springframework.stereotype.Component;

@Component
public class TestCache {

    private String name = "132";

    @EasyCache(cacheNames = "redis",expire = 60)
    public String test(String str){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "中文";
    }
}
