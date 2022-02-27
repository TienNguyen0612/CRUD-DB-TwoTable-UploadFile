package codegym.repository;

import codegym.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByNameContaining(String name);

    @Query(value = "select * from product where category_id = :id", nativeQuery = true)
    Iterable<Product> findAllByCategory(long id);
}
