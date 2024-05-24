package ua.com.service;

import ua.com.dto.CredentialsDTO;
import ua.com.dto.SignUpDTO;
import ua.com.dto.UserDTO;

public interface UserService {

    UserDTO login(CredentialsDTO credentialsDTO);

    UserDTO register(SignUpDTO userDto);

    UserDTO findByLogin(String login);

}