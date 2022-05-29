package com.blognews.api.service.impl;

import com.blognews.api.model.Category;
import com.blognews.api.repository.ICategoryRepository;
import com.blognews.api.service.ICategoryService;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.CategoryMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    private ICategoryRepository categoryRepository;

    // constructor

    public CategoryService(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> obtenerTodas() {
        List<Category> categories = categoryRepository.findAll();
        return ModelMapperUtils.mapAll(categories, CategoryDTO.class);
    }

    @Override
    public List<CategoryMinimalDTO> obtenerTodasMin() {
        List<Category> categories = categoryRepository.findAll();
        return ModelMapperUtils.mapAll(categories, CategoryMinimalDTO.class);
    }

    @Override
    public CategoryDTO obtenerCategory(Long id){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if(categoryOptional.isPresent()){
            return ModelMapperUtils.map(categoryOptional.get(), CategoryDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public CategoryDTO guardar(CategoryDTO categoryDTO){
        Category categoryEntidad = ModelMapperUtils.map(categoryDTO, Category.class);
        categoryEntidad = categoryRepository.save(categoryEntidad);
        return ModelMapperUtils.map(categoryEntidad, CategoryDTO.class);
    }

    @Override
    public void borrar(Long id){
        Optional<Category> categoryOptional  = categoryRepository.findById(id);
        if (categoryOptional.isPresent()) {
            categoryRepository.delete(categoryOptional.get());
        }else {
            System.out.println("No existe la Categoria:" + id);
        }
    }

}
