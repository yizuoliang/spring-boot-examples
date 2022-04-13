package com.yizuoliang.service;

import com.yizuoliang.engine.Strategy;
import com.yizuoliang.engine.StrategyContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ActivitiesServiceImpl
 * @Description:
 * @Author: yizuoliang
 * @Date: 2022/4/12 17:02
 */
@Slf4j
@Service
public class ActivitiesServiceImpl implements ActivitiesService {
    @Autowired
    private StrategyContext strategyContexts;

    @Override
    public void getCoupons(String rewardType) {
        Strategy strategy = strategyContexts.getStrategy(rewardType);
        strategy.issue();
    }
}
