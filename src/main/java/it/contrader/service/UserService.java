package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.UserConverter;
import it.contrader.dao.UserRepository;
import it.contrader.dto.UsersDTO;
import it.contrader.model.Users;

/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */
@Service
public class UserService extends AbstractService<Users, UsersDTO> {
@Autowired
UserRepository repository;
@Autowired
UserConverter converter;
	
//LOGIN method
	public UsersDTO findByUsernameAndPassword(String username, String password) {
		return converter.toDTO(((UserRepository) repository).findByUsernameAndPassword(username, password));
	}
}
