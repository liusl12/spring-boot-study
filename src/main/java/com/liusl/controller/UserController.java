package com.liusl.controller;

import com.liusl.model.User;
import com.liusl.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

/**
 * created by l1 on 2017/12/21.
 */
@RestController
@RequestMapping(value = "/v1")
public class UserController {

//    private User user;//接受前台传的参数实体类

    @Autowired
    private UserServiceImpl userService;

    /*
    创建User对象
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Map create(@RequestParam("name") String name,
                      @RequestParam("sex") String sex,
                      @RequestParam("age") Integer age){
        User user = new User(name,sex,age);
        userService.create(user);
        Map response = new HashMap<String,String>();
        response.put("response","success");
        return response;
    }
    /*
    跟据ID 查询User信息
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User selectUser(@PathVariable("id") Integer id){
        return userService.selectUser(id);
    }

    /*
    更新User信息
     */
    @RequestMapping(value = "/user/update",method = RequestMethod.PUT)
    public User updateUser(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("sex") String sex,
                           @RequestParam("age") Integer age){
        User user = new User(name,sex,age);
        user.setId(id);
        userService.updateUser(user,id);
        return this.selectUser(id);
    }
    /*
    根据ID删除User信息
     */
    @RequestMapping(value = "/user/delete",method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam("id") Integer id){
        userService.deleteUser(id);
        return "success";
    }
}
