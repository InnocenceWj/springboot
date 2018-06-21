package com.wj.demo.controller;

import com.wj.demo.entity.Good;
import com.wj.demo.service.GoodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/good")
public class GoodController {
    @Resource
    @Qualifier("goodService")
    private GoodService goodService;

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Good selectByPrimaryKey(int id){
        return goodService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/addGood")
    public void addGood(Good good){
        if(good!=null){
           goodService.insert(good);
        }
    }

}
