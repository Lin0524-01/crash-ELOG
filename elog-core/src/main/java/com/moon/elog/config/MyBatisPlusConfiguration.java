package com.moon.elog.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfiguration {
    /**
     * 配置Mybatis分页插件
     *
     * @return 分页插件
     */
    @Bean
    public PaginationInnerInterceptor myBatisPlusInterceptor() {
        return new PaginationInnerInterceptor();
    }
}
