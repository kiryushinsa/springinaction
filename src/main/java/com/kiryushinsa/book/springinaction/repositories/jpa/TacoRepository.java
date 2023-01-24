package com.kiryushinsa.book.springinaction.repositories.jpa;

import com.kiryushinsa.book.springinaction.pojo.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
