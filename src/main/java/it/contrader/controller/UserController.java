package it.contrader.controller;

/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.UsersDTO;
import it.contrader.service.UserService;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController extends AbstractController<UsersDTO>{
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/login")
	public UsersDTO login( @RequestBody LoginDTO loginDTO ) {
		return userService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
	}
}