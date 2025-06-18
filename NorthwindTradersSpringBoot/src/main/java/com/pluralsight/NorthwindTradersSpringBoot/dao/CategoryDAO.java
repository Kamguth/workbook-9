package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAll();
    Category getById(int id);
    Category insert(Category category);
}
