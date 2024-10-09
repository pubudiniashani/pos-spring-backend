package lk.ijse.poswithspringbackend.service.impl;

import lk.ijse.poswithspringbackend.dao.CustomerDAO;
import lk.ijse.poswithspringbackend.dto.CustomerStatus;
import lk.ijse.poswithspringbackend.dto.impl.CustomerDTO;
import lk.ijse.poswithspringbackend.service.CustomerService;
import lk.ijse.poswithspringbackend.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private Mapping customerMapping;
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerStatus getCustomer(String customerId) {
        return null;
    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {

    }
}
