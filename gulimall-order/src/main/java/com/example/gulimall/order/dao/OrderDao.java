package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tangshuai
 * @email zz990027566@gmail.com
 * @date 2020-10-19 17:17:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
