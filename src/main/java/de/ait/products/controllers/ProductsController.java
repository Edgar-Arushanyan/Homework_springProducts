package de.ait.products.controllers;


import de.ait.products.foodsMarket.FoodsMarket;
import de.ait.products.products.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ProductsController {

    private final FoodsMarket foodsMarket;

    public ProductsController(FoodsMarket market) {
        this.foodsMarket = market;
    }


    @GetMapping("/products")
    @ResponseBody
    public List<Product> getProducts() {

       return foodsMarket.getAllProducts();
    }
}
