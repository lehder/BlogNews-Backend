package com.blognews.api.resource;

import com.blognews.api.service.ICategoryService;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.CategoryMinimalDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryResource {

    private ICategoryService categoryService;

    public CategoryResource(ICategoryService categoryService){

        this.categoryService = categoryService;
    }

    @GetMapping("/category")
        public List<CategoryDTO> obtainListCategory(){

        List<CategoryDTO> category = new ArrayList<CategoryDTO>();

        category = categoryService.obtenerTodas();
        return category;
    }
    @GetMapping("/categories-min")
    public List<CategoryMinimalDTO> obtenerListaMinCategories(){
        List<CategoryMinimalDTO> categoryMinimalList = categoryService.obtenerTodasMin();
        return categoryMinimalList;
    }

    @PostMapping("/categories")
    public CategoryDTO crearCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.guardar(categoryDTO);
        //return categoryDTO;
    }
}
