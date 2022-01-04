package com.graduation.travel.service.impl;

import com.graduation.travel.entity.Customer;
import com.graduation.travel.mapper.customerMessageMapper;
import com.graduation.travel.service.IcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerBiz implements IcustomerService{
    @Autowired
    private customerMessageMapper mapper;

    @Override
    public int createCustomer(Customer customer) {
        return mapper.createCustomer(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return mapper.updateCustomer(customer);
    }
}
