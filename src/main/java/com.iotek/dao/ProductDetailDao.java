package com.iotek.dao;

import com.iotek.po.ProductDetail;

/**
 * Created by xiaohuang on 2018/3/1.
 */
public interface ProductDetailDao {
    ProductDetail findProductDetailById(int id);
    ProductDetail findProductDetailByPId(int pId);
}
