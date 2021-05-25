package com.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyapeng on 2020/8/5 10:16
 */
@RestController
public class XueXiController {

    private  static  int  i=0;

    @GetMapping("welcome")
    public int test(){

    String code="25K";
        System.out.println("欢迎来到新世界！");
        i++;
        return   i;
    }
}
