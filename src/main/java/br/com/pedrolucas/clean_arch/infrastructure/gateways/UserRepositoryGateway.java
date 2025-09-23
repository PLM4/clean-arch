package br.com.pedrolucas.clean_arch.infrastructure.gateways;

import br.com.pedrolucas.clean_arch.application.gateways.UserGateway;
import br.com.pedrolucas.clean_arch.domain.entity.User;
import br.com.pedrolucas.clean_arch.infrastructure.persistence.UserEntity;
import br.com.pedrolucas.clean_arch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
