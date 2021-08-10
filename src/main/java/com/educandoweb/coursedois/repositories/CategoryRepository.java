package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.Category;
                                                   //tipo da entidade e tipo do ID  
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
