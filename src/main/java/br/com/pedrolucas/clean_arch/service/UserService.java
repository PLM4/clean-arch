package br.com.pedrolucas.clean_arch.service;

import org.springframework.stereotype.Service;
import br.com.pedrolucas.clean_arch.model.User;
import br.com.pedrolucas.clean_arch.repository.UserRepository;

@Service
public class UserService  {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        userRepository.save(user);
    }
}
