package br.com.cadastrarproduto.infra.gateways.user;

import br.com.cadastrarproduto.application.gateways.TheUserRepository;
import br.com.cadastrarproduto.domain.user.User;
import br.com.cadastrarproduto.infra.persistence.user.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepositoryJpa implements TheUserRepository {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryJpa(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User registerUser(User user) {
        var userEntity = userEntityMapper.toEntity(user);
        userRepository.save(userEntity);
        return userEntityMapper.toDomain(userEntity);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userEntityMapper::toDomain)
                .collect(Collectors.toList());
    }
}
