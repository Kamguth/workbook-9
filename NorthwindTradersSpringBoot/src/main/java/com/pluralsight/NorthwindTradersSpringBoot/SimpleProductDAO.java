package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*@Component
public class SimpleProductDAO implements ProductDAO {

    private List<Product> products = new ArrayList<>();

    public SimpleProductDAO() {
        // Add sample products
        products.add(new Product(1, "Laptop", "Electronics", 1200.00));
        products.add(new Product(2, "Coffee Mug", "Kitchenware", 9.99));
        products.add(new Product(3, "Desk Chair", "Furniture", 150.00));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
    @Override
    public void delete(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }

    @Override
    public void update(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == updatedProduct.getProductId()) {
                products.set(i, updatedProduct);
                break;
            }
        }
    }

    @Override
    public Product getById(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }

}*/
