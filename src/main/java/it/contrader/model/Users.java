package it.contrader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

	public enum UsersType{
		ADMIN,
		USER
	}
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private UsersType usertype;
}
    
