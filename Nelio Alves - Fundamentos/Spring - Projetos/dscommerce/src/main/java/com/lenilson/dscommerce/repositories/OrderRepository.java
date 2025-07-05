package com.lenilson.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenilson.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
