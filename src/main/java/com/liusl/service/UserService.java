package com.liusl.service;

import com.liusl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * created by l1 on 2017/12/21.
 */
@Service
public interface UserService {
    /*
    新增一个User
     */
    public void create(User user);
    /*
    根据User ID查询User信息
     */
    public User selectUser(Integer id);
    /*
    根据ID更新User信息
     */
    public void updateUser(User user,Integer id);
    /*
    根据ID删除User信息
     */
    public void deleteUser(Integer id);
}
