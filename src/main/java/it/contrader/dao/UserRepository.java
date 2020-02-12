package it.contrader.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Users;


/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */
@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

	
	Users findByUsernameAndPassword(String username, String password);
	
}
