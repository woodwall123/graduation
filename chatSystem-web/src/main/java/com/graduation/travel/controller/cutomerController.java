package com.graduation.travel.controller;

import com.graduation.travel.entity.Customer;
import com.graduation.travel.service.IcustomerService;
import com.graduation.travel.service.impl.customerBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cutomer")
public class cutomerController {
    @Autowired
    private IcustomerService icustomer;

    @RequestMapping("/createCustomer")
    public int createCustomer(@RequestBody Customer customer){
        int a = icustomer.createCustomer(customer);
        return a;
    }
    @RequestMapping("/updateCustomer")
    public int updateCustomer(@RequestBody Customer customer){
        int a = icustomer.updateCustomer(customer);
        return a;
    }
}
