package br.com.pedrolucas.clean_arch.infrastructure.controllers;

import br.com.pedrolucas.clean_arch.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.name(), user.email());
    }
    
    public User toUser(CreateUserRequest request){
        return new User(request.name(), request.password(), request.email());
    }
}
