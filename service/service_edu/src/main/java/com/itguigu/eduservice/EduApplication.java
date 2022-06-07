package com.itguigu.eduservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/7
 * Time: 22:18
 * Description: No Description
 * @author hhp
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.itguigu"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}
