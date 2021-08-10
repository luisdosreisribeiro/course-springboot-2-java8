package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.Product;
                                                   //tipo da entidade e tipo do ID  
public interface ProductRepository extends JpaRepository<Product, Long> {

}
