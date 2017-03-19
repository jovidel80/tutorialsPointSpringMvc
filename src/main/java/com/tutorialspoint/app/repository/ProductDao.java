package com.tutorialspoint.app.repository;

import com.tutorialspoint.app.domain.Product;

import java.util.List;

/**
 * Created by jose on 19/03/2017.
 */
public interface ProductDao {
    List<Product> getProductList();
    void saveProduct(Product prod);
}
