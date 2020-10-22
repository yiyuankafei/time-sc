package com.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 一元咖啡
 * @site www.zhulu.coms
 * @create 2020-10-06 17:07
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/t1")
    public String t1(String name) {
        System.out.println("11111111111111111");
        return "hi:" + name;
    }
}
