package com.smartaddress.demo.service;

import com.smartaddress.demo.po.ChancePoint;

/**
 * 机会点
 */
public interface ChacePointService {

    //创建机会点
    ChancePoint save(ChancePoint point);


    /**
     * 修改机会点
     * @param point
     * @return
     */
    ChancePoint update(ChancePoint point);
}
