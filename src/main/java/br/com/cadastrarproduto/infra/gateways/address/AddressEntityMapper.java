package br.com.cadastrarproduto.infra.gateways.address;

import br.com.cadastrarproduto.domain.address.Address;
import br.com.cadastrarproduto.domain.user.User;
import br.com.cadastrarproduto.infra.persistence.address.AddressEntity;
import br.com.cadastrarproduto.infra.persistence.user.UserEntity;

public class AddressEntityMapper {

    public AddressEntity toEntity(Address address){
        return new AddressEntity(address.getCep(), address.getNumero(), address.getComplemento());
    }

    public Address toDomain(AddressEntity addressEntity){
        return new Address(addressEntity.getCep(), addressEntity.getNumero(), addressEntity.getComplemento());
    }

}
