package com.atguigu.gulimall.coupon.fegin;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 声明 用openFegin
 * 注意： FeiginClient 使用的是被调用的服务的服务名
 * */
@FeignClient("gulimall-coupon")
public interface CouponFeginService {

    @RequestMapping("/coupon/coupon/member/couponslate")
    public R beforecoupons();
}
