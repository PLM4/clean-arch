package br.com.pedrolucas.clean_arch.application.gateways;

import br.com.pedrolucas.clean_arch.domain.entity.User;

public interface UserGateway {
    User createUser (User user);
}
