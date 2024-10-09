package lk.ijse.poswithspringbackend.service;

import lk.ijse.poswithspringbackend.dto.CustomerStatus;
import lk.ijse.poswithspringbackend.dto.impl.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerStatus getCustomer(String customerId);
    void deleteCustomer(String customerId);
    void updateCustomer(String customerId , CustomerDTO customerDTO);

}
