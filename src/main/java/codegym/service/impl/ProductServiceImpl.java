package codegym.service.impl;

import codegym.model.Category;
import codegym.model.Product;
import codegym.repository.IProductRepository;
import codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> findAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(long id) {
        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public ArrayList<Product> getAllProductsByName(String name) {
        return (ArrayList<Product>) productRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Product> getAllProductsByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }
}
