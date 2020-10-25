package com.example.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//注解启动nacos服务中心
/**
 * 想要远程调用优惠券服务
 * 引入open-feign依赖（具有远程调用别人的能力）
 * 编写一个接口，告诉spring-cloud，这个接口需要调用远程服务
 * 声明接口的每一个方法都是调用哪个远程服务的那个请求
 * 开启远程调用功能
 * @EnableFeignClients(basePackages = "com.example.gulimall.member.feign")
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.gulimall.member.feign")
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
