package br.com.cadastrarproduto.application.usecases;

import br.com.cadastrarproduto.application.gateways.TheUserRepository;
import br.com.cadastrarproduto.domain.user.User;

public class CreateUser {
    private final TheUserRepository theUserRepository;

    public CreateUser(TheUserRepository userRepository) {
        this.theUserRepository = userRepository;
    }

    public User newUser(User user){
        return this.theUserRepository.registerUser(user);
    }
}
