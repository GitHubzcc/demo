package com.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.demo.annotation.Log;
import com.demo.base.AdminBaseController;
import com.demo.entity.UserDO;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController extends AdminBaseController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/hellw")
    String hello() {
        return "this is test spring-boot";
    }

    @Log("查询系统用户列表")
    @GetMapping("/list")
    @ResponseBody
    Page<UserDO> list(UserDO userDTO) {
        Wrapper<UserDO> wrapper = new EntityWrapper<UserDO>(userDTO);
        // 查询列表数据

        return userService.selectPage(getPage(UserDO.class),wrapper);
    }

    @GetMapping("/html")
    String getHtml(Model model){
        UserDO userDO = userService.selectById(1L);
        model.addAttribute("user",userDO);
        return "/index";
    }

    @RequestMapping(value = "/")
    String page(){
        return "sdfsdfsdf";
    }
}
