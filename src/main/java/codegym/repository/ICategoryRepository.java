package codegym.repository;

import codegym.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Long> {
    @Query(value = "from Category where name like :name")
    Optional<Category> findByName(@Param("name") String name);
}
