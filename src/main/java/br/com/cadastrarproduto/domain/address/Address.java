package br.com.cadastrarproduto.domain.address;

import br.com.cadastrarproduto.infra.persistence.address.AddressEntity;

public class Address {
    private Long id;
    private String cep;
    private Integer numero;
    private String complemento;

    public Address(String cep, Integer numero, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
