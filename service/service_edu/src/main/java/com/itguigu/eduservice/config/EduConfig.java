package com.itguigu.eduservice.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/7
 * Time: 22:42
 * Description: No Description
 * @author hhp
 */
@Configuration
@MapperScan("com.itguigu.eduservice.mapper")
public class EduConfig {
    /**
     * 逻辑删除注入器
     * @return
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
