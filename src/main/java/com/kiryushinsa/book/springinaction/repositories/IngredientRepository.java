package com.kiryushinsa.book.springinaction.repositories;

import com.kiryushinsa.book.springinaction.pojo.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
