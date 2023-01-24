package com.kiryushinsa.book.springinaction.repositories.jdbc;

import com.kiryushinsa.book.springinaction.pojo.Taco;

public interface TacoRepository {

    Taco save(Taco design);
}
