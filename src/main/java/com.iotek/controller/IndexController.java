package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaohuang on 2018/3/9.
 * ----------------The heart withered--------
 */
@Controller
public class IndexController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value ="")
    public   String   indexPage(){
      /*  if (true){
            throw  new  NullPointerException();
        }*/

        return "customer/index";
    }
    @RequestMapping(value = "/customerIndex.do")
    public   String   customerIndex(HttpServletRequest request, Customer customer, Model model, HttpSession session){

//        检查cookie
        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            return "redirect:/customer/login.view";
        }
        String customerName=null;
        String customerPassword=null;
        for (Cookie cookie : cookies) {
            if ("customerName".equals(cookie.getName())){
                customerName=cookie.getValue();

            }
            if ("customerPassword".equals(cookie.getName())){
                customerPassword=cookie.getValue();

            }

        }
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        System.out.println("--------->"+customer);
        customer = customerService.queryCustomerByName(customer);
        if (customer == null) {
            model.addAttribute("info","登录失败");
            return "redirect:/customer/login.view";
        }

        session.setAttribute("customer",customer);
        model.addAttribute("info","登录成功");

        return "success";


    }

    @RequestMapping(value = "/adminIndex.do")
    public   String   adminIndex(){

     return  null;
    }
}
