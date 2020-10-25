package com.example.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
//注解启动nacos服务中心
@EnableDiscoveryClient
/**
 第一点。 如何使用nacos作为配置中心统一管理配置
 1.）引入依赖
 <!--spring-cloud配置、管理中心-->
 <dependency>
 <groupId>com.alibaba.cloud</groupId>
 <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 </dependency>
 2.）创建一个bootstrap.properties文件（文件名固定，spring-boot规定）配置两项数据
 当前应用的名字；配置中心服务器的地址
 spring.application.name=gulimall-coupon
 spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 3.）给配置中心默认管理那里添加一个当前应用名.properties文件，后缀名为properties的数据集
 gulimall-coupon.properties
 4.）给 gulimall-coupon.properties添加任何配置
 5.）动态获取并刷新配置，结合两个注解
 //从nacos服务器端修改数据信息动态刷新
 @RefreshScope
 //获取某个配置的值
 @Value("${coupon.user.name}")
 如果配置中心和当前应用文件中都配置了相同的项目，优先使用配置中心的配置

 第二点。细节
 1.)命名空间。配置隔离
 默认（public）默认新增的所有配置都在啊该文件下
 1.在开发，测试，生产利用命名空间来做环境隔离
 在bootstrap.properties里面配置上我们需要使用哪个命名空间下的配置
 spring.cloud.nacos.config.namespace=62ea00a5-1f2f-4a8a-839c-47cee17ba433
 2.基于我们每一个微服务之间互相隔离，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 2.)配置集，所有配置集合就叫配置集
 3.)配置集ID：类似文件名，nacos里面的Data ID:
 4.)配置分组
 默认所有的配置集都属于：DEFAULT_GROUP
 11.11,6.18,12.12用不同的分组
 每个微服务创建自己的命名空间，使用配置分组来区分他的环境，dev,test,prop,

 第三点。同时加载多个配置集
 微服务任何配置信息，任何配置文件都可以放在配置中心中
 只需要在bootstrap.properties中来说明加载配置中心中哪些配置文件即可
 @Value @ConfigurationProperties有关spring-boot任何方法获取值都可以使用
 配置中心有的优先使用配置中心的




 */

public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
