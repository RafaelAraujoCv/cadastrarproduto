package br.com.cadastrarproduto.domain.address;

public record AddressDto(
        String cep,
        Integer numero,
        String complemento
) {

}
