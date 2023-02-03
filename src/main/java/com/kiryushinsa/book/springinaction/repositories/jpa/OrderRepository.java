package com.kiryushinsa.book.springinaction.repositories.jpa;

import com.kiryushinsa.book.springinaction.pojo.Order;
import com.kiryushinsa.book.springinaction.pojo.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<Order> findByUserOrderByPlacedAtDesc(User user, PageRequest pageable);
}
