package com.yizuoliang.engine;

import com.yizuoliang.request.HotelRequest;
import com.yizuoliang.domain.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Hotel
 * @Description: 酒店类型服务的实现类
 * @Author: yizuoliang
 * @Date: 2022/4/12 15:40
 */
@Service
public class Hotel implements Strategy{

    @Autowired
    private HotelService hotelService;

    @Override
    public void issue(Object... params) {
        HotelRequest request = new HotelRequest();
        request.addHotelReq(params);
        hotelService.sendPrize(request);
    }
}
