package com.wj.demo.dao.datasource2Dao;

import com.wj.demo.entity.Good;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodDao {
    int deleteByPrimaryKey(Integer gId);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}