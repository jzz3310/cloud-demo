package com.jzz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:jzz
 * @date:2021/10/25
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/world")
    public String helloWorld(String s){
        System.out.println("传入的值为："+s);
        return "传入的值为："+s;
    }
}
