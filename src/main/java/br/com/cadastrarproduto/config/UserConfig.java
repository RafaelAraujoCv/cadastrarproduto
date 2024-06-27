package br.com.cadastrarproduto.config;

import br.com.cadastrarproduto.application.gateways.TheUserRepository;
import br.com.cadastrarproduto.application.usecases.CreateUser;
import br.com.cadastrarproduto.application.usecases.ListUser;
import br.com.cadastrarproduto.infra.gateways.user.UserEntityMapper;
import br.com.cadastrarproduto.infra.gateways.user.UserRepositoryJpa;
import br.com.cadastrarproduto.infra.persistence.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUser createUser(TheUserRepository userRepository){
        return new CreateUser(userRepository);
    }

    @Bean
    ListUser listUser(TheUserRepository userRepository){
        return  new ListUser(userRepository);
    }

    @Bean
    UserRepositoryJpa createRepositoryJpa(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryJpa(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper returnMapper(){
        return new UserEntityMapper();
    }
}
