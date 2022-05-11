package com.blognews.api.repository;

import com.blognews.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
