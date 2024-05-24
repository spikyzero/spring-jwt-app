package ua.com.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ua.com.dto.SignUpDTO;
import ua.com.dto.UserDTO;
import ua.com.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toUserDTO(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDTO signUpDTO);

}