package com.example.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 *  1.导入依赖
 *   <!--mybatis-plus-->
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.0</version>
 *         </dependency>
 *   2.配置数据源，连接哪些数据库，配置mybatis-plus
 *   导入数据库驱动
 *   在application.yml配置数据源相关信息
 *  配置mapperscan扫描dao包
 *  告诉mybatis-plus，我们这些sql映射文件都在哪里
 *
 */
@EnableFeignClients(basePackages = "com.example.gulimall.ware.feign")
@MapperScan("com.example.gulimall.ware.dao")
@SpringBootApplication
public class GulimallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }

}
