package com.kiryushinsa.book.springinaction.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Entity
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Data
public class Ingredient {

    @Id
    private final String id;

    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
