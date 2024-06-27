package br.com.cadastrarproduto.infra.persistence.address;

import br.com.cadastrarproduto.domain.address.Address;
import br.com.cadastrarproduto.infra.persistence.user.UserEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "address_db")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private Integer numero;
    private String complemento;

    @OneToOne(cascade = { CascadeType.DETACH })
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public AddressEntity(){}

    public AddressEntity(String cep, Integer numero, String complemento) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        //this.user = user;
    }

    public AddressEntity(Address address) {
        this.cep = address.getCep();
        this.numero = address.getNumero();
        this.complemento = address.getComplemento();
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }



}
