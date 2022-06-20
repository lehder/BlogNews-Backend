package com.blognews.api.model.resource;

import com.blognews.api.service.ICategoryService;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.CategoryMinimalDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.GET, RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class CategoryResource {

    private ICategoryService categoryService;
    public CategoryResource(ICategoryService categoryService){
        this.categoryService = categoryService;
    }

    @CrossOrigin
    @GetMapping("/categories")
        public List<CategoryDTO> obtenerListaCategories(){
        List<CategoryDTO> categoriesList = new ArrayList<CategoryDTO>();
        //List<CategoryDTO> categoriesList = categoryService.obtenerTodas();
        categoriesList = categoryService.obtenerTodas();
        return categoriesList;
    }

    @CrossOrigin
    @GetMapping("/categories/{id}")
        public CategoryDTO obtenerCategory(@PathVariable Long id){
          return categoryService.obtenerCategory(id);
    }

    @CrossOrigin
    @GetMapping("/categories-min")
    public List<CategoryMinimalDTO> obtenerListaMinCategoryes(){
        List<CategoryMinimalDTO> categoryMinimalList = categoryService.obtenerTodasMin();
        return categoryService.obtenerTodasMin();
    }

    @CrossOrigin
    @PostMapping("/categories")
    public CategoryDTO crearCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.guardar(categoryDTO);
    }

    @CrossOrigin
    @PutMapping("/categories")
    public CategoryDTO modificarCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.guardar(categoryDTO);
    }

    @CrossOrigin
    @DeleteMapping("/categories/{id}")
    public void borrarCategory(@PathVariable Long id){
        categoryService.borrar(id);
    }

}
