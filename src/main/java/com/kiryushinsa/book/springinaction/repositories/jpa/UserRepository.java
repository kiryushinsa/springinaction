package com.kiryushinsa.book.springinaction.repositories.jpa;

import com.kiryushinsa.book.springinaction.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
