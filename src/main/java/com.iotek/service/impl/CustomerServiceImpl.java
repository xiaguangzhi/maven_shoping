package com.iotek.service.impl;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiaohuang on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override

    public Customer queryCustomerByName(Customer customer) {
        if (customer == null) {
            return   null;
        }

        return customerDao.findCustomerByName(customer);
    }

    @Override

    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            return  false;
        }
            return    customerDao.addCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return null;
    }

    @Override
    public Customer findCustomerByid(int cid) {
        return null;
    }

    @Override
    public Customer findCustomerByEmail(String customerName, int id) {
        return null;
    }

    @Override
    public List<Customer> findLikeName(String name) {
        return null;
    }

    @Override
    public List<Customer> findCustomerList(List<Customer> customerList) {
        return null;
    }
}
