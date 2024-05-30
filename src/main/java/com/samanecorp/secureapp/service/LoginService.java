package com.samanecorp.secureapp.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samanecorp.secureapp.dao.LoginDao;
import com.samanecorp.secureapp.dto.UserDTO;
import com.samanecorp.secureapp.entities.UserEntity;
import com.samanecorp.secureapp.exception.EntityNotFoundException;
import com.samanecorp.secureapp.mapper.UserMapper;
import com.samanecorp.secureapp.repository.Repository;
import com.samanecorp.secureapp.repository.RepositoryImpl;

public class LoginService {
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);

    private Repository<UserEntity> repository = new RepositoryImpl<UserEntity>();

    private LoginDao loginDao = new LoginDao();
    // login d authentication
    public Optional<UserDTO> loginUser (String email, String password) {

        logger.info("Tentative email : {} pwd : {}", email, password);

        return loginDao.loginUser(email, password)
                .map(user -> {
                    UserDTO userDto = UserMapper.userEntityToUserDTO(user);
                    logger.info("infos correct !");
                    return Optional.of(userDto) ;
                }).orElseThrow( () -> new EntityNotFoundException("login ou mot de passe incorrect."));
    }
    // Enregistrer un utilisateur
    public boolean saveUser(UserDTO userDto) {
    	
        return repository.add(UserMapper.userDtoToUserEntity(userDto));
    }

}
