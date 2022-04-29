package com.blognews.api.service.impl;

import com.blognews.api.model.Category;
import com.blognews.api.service.ICategoryService;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.CategoryMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Override
    public List<CategoryDTO> obtenerTodas() {
        List<Category> categories = initializeCategories();
        return ModelMapperUtils.mapAll(categories, CategoryDTO.class);
    }

    @Override
    public List<CategoryMinimalDTO> obtenerTodasMin() {
        List<Category> categories = initializeCategories();
        return ModelMapperUtils.mapAll(categories, CategoryMinimalDTO.class);
    }

    private List<Category> initializeCategories() {
        List<Category> categories = new ArrayList<Category>();

        Category category1 = new Category((int) '1', "Nacionales", "Todas las noticias nacionales", "");
        categories.add(category1);
        Category category2 = new Category((int) '2', "Internacionales", "Todas las noticias internacionales", "");
        categories.add(category2);
        Category category3 = new Category((int) '3', "Deportes", "Noticias deportivas", "");
        categories.add(category3);
        Category category4 = new Category((int) '4', "Tendencias", "Lo ultimo en tendencias", "");
        categories.add(category4);
        Category category5 = new Category((int) '5', "Tecnologia", "Tecnologias a nivel mundial", "");
        categories.add(category5);

        return categories;
    }
}
