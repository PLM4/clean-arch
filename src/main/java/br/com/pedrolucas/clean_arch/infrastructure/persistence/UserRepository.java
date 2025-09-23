package br.com.pedrolucas.clean_arch.infrastructure.persistence;

import br.com.pedrolucas.clean_arch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
}
