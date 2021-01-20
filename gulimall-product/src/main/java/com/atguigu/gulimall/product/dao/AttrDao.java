package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author pzf
 * @email sunlightcs@gmail.com
 * @date 2021-01-13 23:25:22
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
