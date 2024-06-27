package br.com.cadastrarproduto.domain.user;

import br.com.cadastrarproduto.domain.address.Address;
import br.com.cadastrarproduto.infra.persistence.address.AddressEntity;

import java.time.LocalDate;

public class User {
    private Long id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    private Address address;

    public User(String cpf, String email, LocalDate nascimento, String nome) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
