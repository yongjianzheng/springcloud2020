package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--ok的降级";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--超时的降级";
    }
}
