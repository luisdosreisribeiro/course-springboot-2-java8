package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.Order;
                                                   //tipo da entidade e tipo do ID  
public interface OrderRepository extends JpaRepository<Order, Long> {

}
