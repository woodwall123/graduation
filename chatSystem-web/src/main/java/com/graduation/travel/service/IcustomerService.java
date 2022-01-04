package com.graduation.travel.service;

import com.graduation.travel.entity.Customer;

public interface IcustomerService {
    //创建用户
    int createCustomer(Customer customer);
    //修改用户信息
    int updateCustomer(Customer customer);
}
