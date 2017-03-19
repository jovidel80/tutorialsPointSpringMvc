package com.tutorialspoint.app.repository;

import com.tutorialspoint.app.domain.Product;

import java.util.List;

/**
 * Created by jose on 19/03/2017.
 */
public class InMemoryProductDao implements ProductDao {
    private List<Product> products;

    public InMemoryProductDao(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> getProductList() {
        return products;
    }

    @Override
    public void saveProduct(Product prod) {

    }
}
