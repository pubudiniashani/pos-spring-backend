package lk.ijse.poswithspringbackend.dao;

import lk.ijse.poswithspringbackend.entity.impl.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<CustomerEntity,String> {
}
