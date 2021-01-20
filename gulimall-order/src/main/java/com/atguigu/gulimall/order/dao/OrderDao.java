package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pzf
 * @email sunlightcs@gmail.com
 * @date 2021-01-15 00:04:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
