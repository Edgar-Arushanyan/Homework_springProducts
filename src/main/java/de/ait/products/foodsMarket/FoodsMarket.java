package de.ait.products.foodsMarket;


import de.ait.products.products.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodsMarket {

    public List<Product> getAllProducts() {
        Product product1 = new Product(1L, "Tomato", 10);
        Product product2 = new Product(2L, "Potato", 20);
        Product product3 = new Product(3L, "Carrot", 8);
        Product product4 = new Product(3L, "Garlic", 3);


        return Arrays.asList(product1, product2, product3, product4);
    }
}
