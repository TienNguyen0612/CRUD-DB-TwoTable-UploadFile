package codegym.repository;

import codegym.model.Category;
import codegym.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findAllByCategory(Category category);
}
