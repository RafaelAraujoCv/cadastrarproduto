package br.com.cadastrarproduto.infra.gateways.user;

import br.com.cadastrarproduto.domain.user.User;
import br.com.cadastrarproduto.infra.persistence.user.UserEntity;

public class UserEntityMapper {

    public UserEntity toEntity(User user){
        return new UserEntity(user.getCpf(), user.getNome(),
                user.getNascimento(), user.getEmail());
    }

    public User toDomain(UserEntity entity){
        return new User(entity.getCpf(), entity.getNome(), entity.getNascimento(),
                entity.getEmail());
    }
}
