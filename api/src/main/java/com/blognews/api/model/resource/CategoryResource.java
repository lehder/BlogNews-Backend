package com.blognews.api.model.resource;

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
        public List<CategoryDTO> obtenerListaCategoryes(){
        List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();
        List<CategoryDTO> categoriesList = categoryService.obtenerTodas();
        return categoriesList;
    }

    @GetMapping("/category/{id}")
        public CategoryDTO obtenerCategory(@PathVariable Long id){
        return categoryService.obtenerCategory(id);
    }

    @GetMapping("/category-min")
    public List<CategoryMinimalDTO> obtenerListaMinCategoryes(){
       // List<CategoryMinimalDTO> categoryMinimalList = categoryService.obtenerTodasMin();
        return categoryService.obtenerTodasMin();
    }

    @PostMapping("/category")
    public CategoryDTO crearCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.guardar(categoryDTO);
    }

    @PutMapping("/category")
    public CategoryDTO modificarCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.guardar(categoryDTO);
    }

    @DeleteMapping("/category/{id}")
    public void borrarCategory(@PathVariable Long id){
        categoryService.borrar(id);
    }

}
