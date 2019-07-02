package com.xjk.spring.test.controller;

import com.xjk.spring.test.dao.HaaDao;
import com.xjk.spring.test.po.HaaPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private HaaDao haaDao;

    @RequestMapping("/test1")
    public String test1(){
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(){
        return haaDao.testDao();
    }


    @RequestMapping("/test")
    public List<HaaPo> test() {

        return haaDao.selectAllPo();
    }

}
