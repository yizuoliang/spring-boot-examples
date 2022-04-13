package com.yizuoliang.controller;

import com.yizuoliang.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ActivitiesController
 * @Description:
 * @Author: yizuoliang
 * @Date: 2022/4/12 16:57
 */
@RestController
@RequestMapping("/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesService activitiesService;

    @GetMapping("/get-coupons/{rewardType}")
    public void getCoupons(@PathVariable String rewardType) throws Exception {
        activitiesService.getCoupons(rewardType);

    }

}
