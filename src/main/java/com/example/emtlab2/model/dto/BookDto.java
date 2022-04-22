package com.example.emtlab2.model.dto;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.Category;
import lombok.Data;


@Data
public class BookDto {
    private Long id;
    private String name;
    private Category category;
    private Long authorId;
    private Integer availableCopies;

    public BookDto(String name, Category category, Long authorId, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
    }
}
