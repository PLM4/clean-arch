package br.com.pedrolucas.clean_arch.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.pedrolucas.clean_arch.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
