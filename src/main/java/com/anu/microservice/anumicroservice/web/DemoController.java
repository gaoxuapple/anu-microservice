package com.anu.microservice.anumicroservice.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe: 测试入口
 * Author: gao.xu
 * Mail: gao.xu@ustcinfo.com
 * Date: 2018年07月04日 16:32
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping(value = "/index",
                    method = RequestMethod.GET)
    public String index(){
        return "hello world!";
    }


}
