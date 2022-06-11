package com.itguigu.eduservice.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/8
 * Time: 9:04
 * Description: No Description
 * @author hhp
 */
@Configuration
public class MyBatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();

    }
}
