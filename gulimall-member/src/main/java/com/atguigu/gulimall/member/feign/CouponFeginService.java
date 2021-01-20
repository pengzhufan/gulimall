package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//远程调用服务
@FeignClient("gulimall-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();


}
