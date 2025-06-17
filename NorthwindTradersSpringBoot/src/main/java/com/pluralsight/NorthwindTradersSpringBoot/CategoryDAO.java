package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.Category;
import java.util.List;

public interface CategoryDAO {
    List<Category> getAll();
    Category getById(int id);
}
