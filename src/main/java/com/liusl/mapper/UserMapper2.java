package com.liusl.mapper;

import com.liusl.model.User2;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by l1 on 2017/12/27.
 */
@Mapper
public interface UserMapper2 {
    public User2 selectById(Integer id);
}
