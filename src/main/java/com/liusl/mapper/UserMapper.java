package com.liusl.mapper;

import com.liusl.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * created by l1 on 2017/12/21.
 */
@Mapper
public interface UserMapper {
    /*
    新增
     */
    public void create(User user);
//    public Map selectUser(Integer id);
    /*
    查询
     */
    public User selectUser(Integer id);
    /*
    更新
     */
    public void updateUser(User user);
    /*
    删除
     */
    public void deleteUser(Integer id);
}
