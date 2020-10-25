package com.example.gulimall.member.dao;

import com.example.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tangshuai
 * @email zz990027566@gmail.com
 * @date 2020-10-19 16:56:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
