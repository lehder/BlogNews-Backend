package com.blognews.api.repository;

import com.blognews.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
<<<<<<< HEAD
     <name> List<Category> findByCategory(name description);

=======
  // List<Category> findByName(String name);
>>>>>>> prueba
}
