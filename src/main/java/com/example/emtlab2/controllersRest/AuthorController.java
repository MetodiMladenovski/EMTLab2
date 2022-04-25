package com.example.emtlab2.controllersRest;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.dto.AuthorDto;
import com.example.emtlab2.services.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://emt-frontend-181085.herokuapp.com"})
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAll() {
        return this.authorService.findAll();
    }

    @PostMapping
    public ResponseEntity<Author> create(@RequestBody AuthorDto authorDto){
        return this.authorService.create(authorDto)
                .map(author -> ResponseEntity.ok().body(author))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
