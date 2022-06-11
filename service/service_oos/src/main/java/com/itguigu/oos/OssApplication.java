package com.itguigu.oos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/9
 * Time: 14:26
 * Description: No Description
 * @author hhp
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.itguigu"})
public class OssApplication {
    public static void main(String[] args) {


            SpringApplication.run(OssApplication.class, args);
    }
}
