package lk.ijse.poswithspringbackend.util;

import lk.ijse.poswithspringbackend.dto.impl.CustomerDTO;
import lk.ijse.poswithspringbackend.entity.impl.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {

    @Autowired
    private ModelMapper modelMapper;
    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO){
        return modelMapper.map(customerDTO, CustomerEntity.class);
    }
    public CustomerDTO toCustomerDTO(CustomerEntity userEntity){
        return modelMapper.map(userEntity , CustomerDTO.class);
    }

    public List<CustomerDTO> asCustomerDTOlist(List<CustomerEntity> userEntities ){
        return modelMapper.map(userEntities , new TypeToken<List<CustomerDTO>>() {}.getType());
    }

}
