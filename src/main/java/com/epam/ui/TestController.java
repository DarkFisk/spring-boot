package com.epam.ui;

import com.epam.db.Product;
import com.epam.db.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping("welcome")
    @ResponseBody
    String homePage() {
        Product product = new Product();
        product.setName("валянки");
        productRepository.save(product);

        return "Home Page, " + productRepository.count();
    }

    @RequestMapping("list")
    @ResponseBody
    String homePageList(@RequestParam(required = false) String name) {

        List<Product> list = new ArrayList<>();
        Iterable<Product> products;

        if (name == null) {
            products = productRepository.findAll();
        } else {
            products = productRepository.findByName(name);
        }


        for (Product p : products) {
            list.add(p);
        }

        return list.toString();
    }

    //todo spring data
    // TODO: 7/25/16 spring boot template (html/jsp)

}
