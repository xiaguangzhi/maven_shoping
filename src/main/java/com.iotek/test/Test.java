package com.iotek.test;


import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaohuang on 2018/3/7.
 * ----------------The heart withered--------
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        Customer customer = new Customer();
        customer.setCustomerName("xiaowang");
        customer.setCustomerPassword("1234567");
        customer = customerService.queryCustomerByName(customer);
          System.out.println(customer.getId());
    }
}
