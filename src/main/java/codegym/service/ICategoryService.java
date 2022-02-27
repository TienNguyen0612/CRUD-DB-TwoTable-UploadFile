package codegym.service;

import codegym.model.Category;

public interface ICategoryService {
    Iterable<Category> findAllCategories();

    Category saveCategory(Category category);

    void deleteCategory(long id);

    Category findById(long id);

    Category findByName(String name);
}
