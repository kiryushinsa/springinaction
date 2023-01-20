package com.kiryushinsa.book.springinaction.repositories;

import com.kiryushinsa.book.springinaction.pojo.Order;

public interface OrderRepository {

    Order save(Order order);
}
