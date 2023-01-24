package com.kiryushinsa.book.springinaction.repositories.jdbc;

import com.kiryushinsa.book.springinaction.pojo.Order;

public interface OrderRepository {

    Order save(Order order);
}
