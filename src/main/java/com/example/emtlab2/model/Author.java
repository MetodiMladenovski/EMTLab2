package com.example.emtlab2.model;

import lombok.Data;
import lombok.Generated;
import lombok.Value;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    @ManyToOne
    private Country country;

    public Author() {
    }

    public Author(Long id, String name, String surname, Country country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }
}
