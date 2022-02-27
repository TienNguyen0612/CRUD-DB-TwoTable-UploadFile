package codegym.service;

import codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface IProductService {
    Page<Product> findAllProducts(Pageable pageable);

    Product saveProduct(Product product);

    void deleteProduct(long id);

    Product findById(long id);

    ArrayList<Product> getAllProductsByName(String name);

    ArrayList<Product> getAllProductsByCategory(long id);
}
