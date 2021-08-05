package com.sii.performance.MarketSii.controller;


import com.sii.performance.MarketSii.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
      private ProductRepository productRepository;


    @RequestMapping("/api")
    public String getTest() {
       return "{  \n" +
               "    \"Product\": {  \n" +
               "        \"id\":       \"53345345\",   \n" +
               "        \"name\":      Lenovo,   \n" +
               "        \"available\":    true  \n" +
               "    }  \n" +
               "}";
    }

    @RequestMapping("/products")
    public String getAllProducts() {
        return productRepository.findAll();
    }

    @RequestMapping("/clear")
    public String removeProduct() {

        return productRepository.removeProduct();
    }

}
