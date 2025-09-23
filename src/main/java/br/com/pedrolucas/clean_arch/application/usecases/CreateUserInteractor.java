package br.com.pedrolucas.clean_arch.application.usecases;

import br.com.pedrolucas.clean_arch.application.gateways.UserGateway;
import br.com.pedrolucas.clean_arch.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
