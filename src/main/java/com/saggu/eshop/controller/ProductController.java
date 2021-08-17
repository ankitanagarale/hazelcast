package com.saggu.eshop.controller;

import com.saggu.eshop.dao.ProductDao;
import com.saggu.eshop.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping(value = "/products")
    public List<ProductDto> products() {
        return productDao.getProducts();
    }

    @PostMapping(value = "/products")
    public ProductDto addProducts(@RequestBody ProductDto productDto) {
        return productDao.addProduct(productDto);
    }
}
