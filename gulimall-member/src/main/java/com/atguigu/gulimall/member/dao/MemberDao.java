package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pzf
 * @email sunlightcs@gmail.com
 * @date 2021-01-14 23:53:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
