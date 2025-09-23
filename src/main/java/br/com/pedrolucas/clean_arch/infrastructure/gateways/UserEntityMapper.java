package br.com.pedrolucas.clean_arch.infrastructure.gateways;

import br.com.pedrolucas.clean_arch.domain.entity.User;
import br.com.pedrolucas.clean_arch.infrastructure.persistence.UserEntity;

public class UserEntityMapper { 
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.name(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getPassword(), userEntity.getEmail());
    }
}