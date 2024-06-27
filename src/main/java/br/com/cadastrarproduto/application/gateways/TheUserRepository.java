package br.com.cadastrarproduto.application.gateways;

import br.com.cadastrarproduto.domain.user.User;

import java.util.List;

public interface TheUserRepository {

    User registerUser(User user);

    List<User> getAllUsers();
}
