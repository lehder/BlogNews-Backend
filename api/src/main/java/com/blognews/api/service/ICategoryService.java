package com.blognews.api.service;

import com.blognews.api.model.Category;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.CategoryMinimalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    public List<CategoryDTO> obtenerTodas();
    public List<CategoryMinimalDTO> obtenerTodasMin();
    public CategoryDTO guardar(CategoryDTO categoryDTO);
    public CategoryDTO obtenerCategory(Long id);
}
