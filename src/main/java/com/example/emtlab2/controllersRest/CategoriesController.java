package com.example.emtlab2.controllersRest;

import com.example.emtlab2.model.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"https://emt-frontend-181085.herokuapp.com/"})
@RequestMapping("/categories")
public class CategoriesController {

    @GetMapping
    public List<Category> findAll() {
        return Arrays.stream(Category.values()).collect(Collectors.toList());
    }
}
