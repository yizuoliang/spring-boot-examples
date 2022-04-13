package com.yizuoliang.domain.service.impl;

import com.yizuoliang.domain.service.HotelService;
import com.yizuoliang.request.HotelRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HotelServiceImpl
 * @Description: 酒店类实现类
 * @Author: yizuoliang
 * @Date: 2022/4/12 15:58
 */
@Slf4j
@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void sendPrize(HotelRequest request) {
        log.info("发放酒店类的优惠券");
    }
}
