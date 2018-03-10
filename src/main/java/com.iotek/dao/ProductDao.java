package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/1.
 */
public interface ProductDao {

    Product  queryProductById(int pid);
     List<Product> queryallProduct();
}
