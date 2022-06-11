package com.itguigu.servicebase.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/8
 * Time: 9:55
 * Description: No Description
 * @author hhp
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("gmtCreate", LocalDateTime.now(), metaObject);

        this.setFieldValByName("gmtModified",  LocalDateTime.now(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtModified",  LocalDateTime.now(), metaObject);
    }
}
