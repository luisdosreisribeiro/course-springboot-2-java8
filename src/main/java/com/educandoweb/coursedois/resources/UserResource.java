package com.educandoweb.coursedois.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.coursedois.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	/* Tipo de retorno do método ResponseEntity -> tipo de retorno específico do spring para retonar respostas de requisições web<User> vai retornar a classe User*/
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"MAria","maria@gmail.com","999999","123456");
		//ResponseEntity.ok -. para retornar resposta com sucesso no http  .body para retornar o corpo do método instanciado(u)
		return ResponseEntity.ok().body(u);
		
		
	}
	
	

}
