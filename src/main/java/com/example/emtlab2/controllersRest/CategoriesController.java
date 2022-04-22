package com.example.emtlab2.controllersRest;

import com.example.emtlab2.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
@RequestMapping("/categories")
public class CategoriesController {

    @GetMapping
    public List<Category> findAll(){
        return Arrays.stream(Category.values()).collect(Collectors.toList());
    }
}