package com.liusl.service;

import com.liusl.mapper.UserMapper;
import com.liusl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * created by l1 on 2017/12/21.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    /*
    新增
     */
    @Override
    public void create(User user){
        userMapper.create(user);
    }

    /*
    查询
     */
    @Override
    public User selectUser(Integer id){
        User usermap = userMapper.selectUser(id);
        return usermap;
    }
    /*
    更新
     */
    @Override
    public void updateUser(User user,Integer id){
        //通过Id查询出数据库中那条数据
        User oldUser = userMapper.selectUser(id);
        //将更新的值替换旧的数据库的记录
        oldUser.setName(user.getName());
        oldUser.setSex(user.getSex());
        oldUser.setAge(user.getAge());
        User newUser = oldUser;
        userMapper.updateUser(newUser);
    }

}
