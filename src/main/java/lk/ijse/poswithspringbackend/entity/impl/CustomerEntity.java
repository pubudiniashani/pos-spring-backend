package lk.ijse.poswithspringbackend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.poswithspringbackend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity {
    @Id
    private String customerId;
    private String customerName;
    private String address;
    private String contactNumber;

    @OneToMany(mappedBy = "customer")
    private List<OrderEntity> orders;

    @ManyToOne
    private CustomerEntity customer;


}
