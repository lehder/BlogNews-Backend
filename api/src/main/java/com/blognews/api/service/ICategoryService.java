package com.blognews.api.service;

import com.blognews.api.service.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    public List<CategoryDTO> obtenerTodas();
}
