package com.iotek.dao;

import com.iotek.po.Customer;

import java.util.List;

/**
 * Created by xiaohuang on 2018/2/28.
 */
public interface CustomerDao {

    Customer findCustomerByName(Customer customer);


    boolean addCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);

    boolean updateCustomer(Customer customer);

    List<Customer> queryAllCustomer();

    Customer findCustomerByid(int cid);

    Customer findCustomerByEmail(String customerName, int id);

    List<Customer> findLikeName(String name);

    int getCountCustomer();
    List<Customer>  findCustomerList(List<Customer> customerList);


}
