package com.sansui.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "XXL test接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "首页测试",notes = "test port")
    @GetMapping("/indexApi")
    public String index(){
        return "index.html";
    }
}
