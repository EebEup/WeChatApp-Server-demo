package com.mnz.wechatappserverdemo.controller;

import com.mnz.wechatappserverdemo.entity.User;
import com.mnz.wechatappserverdemo.vo.RespBean;
import com.mnz.wechatappserverdemo.vo.RespBeanEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname TestController
 * @Author MNZ
 * @Description
 * @Date 2022/3/24 6:29 PM
 **/
@Controller
@RequestMapping("test")
@Slf4j
@Api
public class TestController {


 @ResponseBody
 @RequestMapping("toTest")
 @ApiOperation("测试")
 RespBean test(){
     return  RespBean.success(new User("lcx","lcx"));
 }





}
