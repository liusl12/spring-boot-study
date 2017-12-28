package com.liusl.mapper;

import com.alibaba.fastjson.JSON;
import com.liusl.model.Order;
import com.liusl.model.User2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * created by l1 on 2017/12/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapper2Test {
    @Autowired
    private UserMapper2 userMapper2;
    @Autowired
    private OrderMapper orderMapper;
    @Test
    public void selectById() throws Exception {
        User2 user2 = userMapper2.selectById(1);
        System.out.println(JSON.toJSONString(user2,true));
    }
    @Test
    public void selectByOrderId() throws Exception{
        Order order = orderMapper.selectByOrderId(1);
        System.out.println(JSON.toJSONString(order,true));
    }

}