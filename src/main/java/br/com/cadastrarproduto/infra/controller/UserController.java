package br.com.cadastrarproduto.infra.controller;

import br.com.cadastrarproduto.application.usecases.CreateUser;
import br.com.cadastrarproduto.application.usecases.ListUser;
import br.com.cadastrarproduto.domain.user.User;
import br.com.cadastrarproduto.domain.user.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CreateUser createUser;
    private final ListUser listUser;

    public UserController(CreateUser createUser, ListUser listUser) {
        this.createUser = createUser;
        this.listUser = listUser;
    }

    @PostMapping(value = "/new")
    public ResponseEntity<UserDto> saveNewUser(@Valid @RequestBody UserDto dto){
        User user = createUser.newUser(new User(dto.cpf(), dto.email(), dto.nascimento(), dto.nome()));
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<UserDto>> listUsers() {
        return ResponseEntity.ok().body(
                listUser.listAllUsers().stream()
                        .map(u -> new UserDto(u.getCpf(), u.getNome(), u.getNascimento(), u.getEmail(), u.getAddress()))
                        .collect(Collectors.toList()));
    }
}
