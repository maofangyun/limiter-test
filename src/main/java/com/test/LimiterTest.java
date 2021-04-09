package com.test;

import com.mfy.limiter.annotation.LimiterScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@LimiterScan("com.test")
@SpringBootApplication
public class LimiterTest {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(LimiterTest.class, args);
        TestCache testCache = run.getBean(TestCache.class);
        for(int i=0; i<3; i++){
            new Thread(() -> {
                String kkk = testCache.test("kkk");
                System.out.println(kkk);
            }).start();
        }

    }
}
