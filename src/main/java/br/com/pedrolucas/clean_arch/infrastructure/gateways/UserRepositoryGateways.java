package br.com.pedrolucas.clean_arch.infrastructure.gateways;

import br.com.pedrolucas.clean_arch.application.gateways.UserGateway;
import br.com.pedrolucas.clean_arch.domain.entity.User;
import br.com.pedrolucas.clean_arch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateways implements UserGateway {
    private final UserRepository userRepository;

    public UserRepositoryGateways(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
