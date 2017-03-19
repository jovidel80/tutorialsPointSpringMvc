package com.tutorialspoint.app.service;

import com.tutorialspoint.app.domain.Product;
import com.tutorialspoint.app.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jose on 19/03/2017.
 */
@Component
public class SimpleProductManager implements ProductManager {
    private static final long serialVersionUID = -4812573323395136180L;

    @Autowired
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void increasePrice(int percentage) {
        List<Product> products = this.productDao.getProductList();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage) / 100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return this.productDao.getProductList();
    }
}
