package com.example.webapp.mapper;


import com.example.webapp.dto.UserRequestDTO;
import com.example.webapp.dto.UserResponseDTO;
import com.example.webapp.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequestDTO dto);

    UserResponseDTO toDTO(User user);
}
