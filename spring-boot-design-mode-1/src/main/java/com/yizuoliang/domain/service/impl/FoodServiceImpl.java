package com.yizuoliang.domain.service.impl;

import com.yizuoliang.domain.service.FoodService;
import com.yizuoliang.request.FoodRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName: FoodServiceImpl
 * @Description:
 * @Author: yizuoliang
 * @Date: 2022/4/12 15:57
 */
@Service
@Slf4j
public class FoodServiceImpl implements FoodService {
    @Override
    public void getCoupon(FoodRequest request) {

        log.info("发放食品类的优惠券");
    }
}
