package com.tutorialspoint.app.service;

import com.tutorialspoint.app.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jose on 19/03/2017.
 */
public interface ProductManager extends Serializable {
    void increasePrice(int percentage);
    List<Product> getProducts();
}
