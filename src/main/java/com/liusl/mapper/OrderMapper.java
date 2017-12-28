package com.liusl.mapper;

import com.liusl.model.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by l1 on 2017/12/27.
 */
@Mapper
public interface OrderMapper {
    public Order selectByOrderId(Integer id);
}
