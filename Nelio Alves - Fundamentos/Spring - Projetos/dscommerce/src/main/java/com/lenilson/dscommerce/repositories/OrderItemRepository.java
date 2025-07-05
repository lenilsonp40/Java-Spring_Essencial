package com.lenilson.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenilson.dscommerce.entities.OrderItem;
import com.lenilson.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
