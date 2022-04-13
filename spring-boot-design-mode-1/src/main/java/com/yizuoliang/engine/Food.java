package com.yizuoliang.engine;

import com.yizuoliang.request.FoodRequest;
import com.yizuoliang.domain.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Food
 * @Description:
 * @Author: yizuoliang
 * @Date: 2022/4/12 15:47
 */
@Service
public class Food implements Strategy {
    @Autowired
    private FoodService foodService;
    @Override
    public void issue(Object... params) {
        FoodRequest request = new FoodRequest(params);
        //获取食物类优惠券
        foodService.getCoupon(request);
    }
}
