package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductSearchServiceWithRepoTest {

    @Autowired
    private ProductSearchServiceWithRepo service;

    @Autowired
    private ProductRepository repository;

    @Test
    void saveSucessTest() {
        Product product = new Product();
        product.setName("notebook");
        product.setPrice(10d);
        product.setCategory("eletronic");
        product.setDescription("del");
        product.setQuantity(2);
        product.setManufacturer("sansung");

        service.createProductIndex(product);

        var products = repository.findByname("notebook");

        assertNotNull(product);

    }

}