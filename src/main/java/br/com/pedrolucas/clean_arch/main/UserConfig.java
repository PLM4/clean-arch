package br.com.pedrolucas.clean_arch.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.pedrolucas.clean_arch.application.gateways.UserGateway;
import br.com.pedrolucas.clean_arch.application.usecases.CreateUserInteractor;
import br.com.pedrolucas.clean_arch.infrastructure.controllers.UserDTOMapper;
import br.com.pedrolucas.clean_arch.infrastructure.gateways.UserEntityMapper;
import br.com.pedrolucas.clean_arch.infrastructure.gateways.UserRepositoryGateway;
import br.com.pedrolucas.clean_arch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
