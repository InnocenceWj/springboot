package com.wj.demo.service.impl;

import com.wj.demo.dao.datasource2Dao.GoodDao;
import com.wj.demo.entity.Good;
import com.wj.demo.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("goodService")
public class GoodServiceImpl implements GoodService{

    @Resource
    private GoodDao goodDao;
    @Override
    public Good selectByPrimaryKey(int gId) {
        return goodDao.selectByPrimaryKey(gId);
    }

    @Override
    public void insert(Good good) {
        goodDao.insert(good);
    }
}
