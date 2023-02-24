package com.example.coco_cafe.service;

import com.example.coco_cafe.entity.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
