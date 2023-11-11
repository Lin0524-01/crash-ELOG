package com.moon.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: BlogApplication
 * @Author lin
 * @Date 2023/11/11 17:04
 * @description: 博客启动类
 */
@SpringBootApplication(scanBasePackages = {"com.moon.blog"})
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
