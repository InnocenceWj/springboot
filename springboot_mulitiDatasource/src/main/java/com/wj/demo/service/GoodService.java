package com.wj.demo.service;

import com.wj.demo.entity.Good;

import java.util.List;

public interface GoodService {
    Good selectByPrimaryKey(int id);
    void insert(Good good);
}
