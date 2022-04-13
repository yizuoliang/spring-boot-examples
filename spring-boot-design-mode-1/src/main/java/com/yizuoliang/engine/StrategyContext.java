package com.yizuoliang.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName: StrategyContext
 * @Description:
 * @Author: yizuoliang
 * @Date: 2022/4/12 15:50
 */
@Component
public class StrategyContext {

    @Autowired
    private Map<String, Strategy> registerMap;

    // 获取策略
    public  Strategy getStrategy(String rewardType) {
        Strategy strategy = registerMap.get(rewardType);
        if(strategy==null){
            throw new IllegalArgumentException("rewardType error!");
        }
        return strategy;
    }

}
