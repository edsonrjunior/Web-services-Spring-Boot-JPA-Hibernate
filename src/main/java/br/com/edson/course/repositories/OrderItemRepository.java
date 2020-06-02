package br.com.edson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edson.course.entities.OrderItem;
import br.com.edson.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}