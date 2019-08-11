package com.itheima.crm.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CommonController {
    @RequestMapping("{page}")
    public String toPge(@PathVariable String page){
        return page;
    }
}
