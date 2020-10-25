package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tangshuai
 * @email zz990027566@gmail.com
 * @date 2020-10-19 10:15:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
