package com.jdk10.example.jdk10demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公共控制层
 */
@RestController
public class ContextController {

    @RequestMapping(value = "/ok")
    public String ok(){
        var var = "ok";
        return var;
    }
}
