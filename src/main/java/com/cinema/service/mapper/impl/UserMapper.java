package com.cinema.service.mapper.impl;

import com.cinema.dto.response.UserResponseDto;
import com.cinema.model.User;
import com.cinema.service.mapper.ResponseDtoMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }
}
