package com.kiryushinsa.book.springinaction.repositories.jpa;

import com.kiryushinsa.book.springinaction.pojo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
