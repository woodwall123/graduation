package com.graduation.travel.mapper;

import com.graduation.travel.entity.Customer;
import com.graduation.travel.entity.CustomerBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface customerMessageMapper {
    //创建用户
   public int createCustomer(Customer customer);
    //修改用户信息
   public int updateCustomer(Customer customer);
}
