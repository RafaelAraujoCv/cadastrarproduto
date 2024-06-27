package br.com.cadastrarproduto.application.usecases;

import br.com.cadastrarproduto.application.gateways.TheUserRepository;
import br.com.cadastrarproduto.domain.user.User;

import java.util.List;

public class ListUser {

    private final TheUserRepository theUserRepository;

    public ListUser(TheUserRepository theUserRepository) {
        this.theUserRepository = theUserRepository;
    }

    public List<User> listAllUsers() {
        return this.theUserRepository.getAllUsers();
    }
}
