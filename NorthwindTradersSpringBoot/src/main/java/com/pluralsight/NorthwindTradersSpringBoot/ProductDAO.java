package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.List;

public interface ProductDAO {
    void add(Product product);
    List<Product> getAll();
    void delete(int productId);
    void update(Product updatedProduct);
    Product getById(int productId); // helpful for update & validation

}
