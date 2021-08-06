package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.User;
                                                   //tipo da entidade e tipo do ID  
public interface UserRepository extends JpaRepository<User, Long> {

}
