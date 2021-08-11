package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.OrderItem;
                                                   //tipo da entidade e tipo do ID  
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
