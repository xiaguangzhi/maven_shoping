package com.iotek.service;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/1.
 */
public interface ProductService {
    Product queryProductById(int pid);

    List<Product> queryAllProduct();
}
