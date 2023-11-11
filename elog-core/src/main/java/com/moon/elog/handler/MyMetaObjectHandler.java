package com.moon.elog.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @Title: MyMetaObjectHandler
 * @Author lin
 * @Date 2023/11/11 15:14
 * @description: 配置MyBatisPlus自动填充
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("createTime", System.currentTimeMillis());
        metaObject.setValue("updateTime", System.currentTimeMillis());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("updateTime", System.currentTimeMillis());
    }
}
