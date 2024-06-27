package br.com.cadastrarproduto.domain.user;

import br.com.cadastrarproduto.domain.address.Address;

import java.time.LocalDate;

public record UserDto(
        String cpf,
        String nome,
        LocalDate nascimento,
        String email,
        Address address
) {
}
