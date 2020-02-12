package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.UsersDTO;
import it.contrader.model.Users;

/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */
@Component
public class UserConverter extends AbstractConverter<Users,UsersDTO> {

	@Override
	public Users toEntity(UsersDTO usersDTO) {
		Users users = null;
		if (usersDTO != null) {
			users = new Users(usersDTO.getId(),usersDTO.getUsername(),usersDTO.getPassword(),usersDTO.getUsertype());			
		}
		return users;
	}

	@Override
	public UsersDTO toDTO(Users users) {
		UsersDTO usersDTO = null;
		if (users != null) {
			usersDTO = new UsersDTO(users.getId(),users.getUsername(),users.getPassword(),users.getUsertype());
			
		}
		return usersDTO;
	}
}