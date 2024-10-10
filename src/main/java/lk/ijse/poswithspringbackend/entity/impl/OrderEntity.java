package lk.ijse.poswithspringbackend.entity.impl;

import jakarta.persistence.*;
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
@Table(name = "orders")
public class OrderEntity {
    @Id
    private String orderId;
    @ManyToOne
    private CustomerEntity customer;
    @OneToMany
    private List<OrderItemEntity> orderitems;
    private BigDecimal total;
    private LocalDateTime date;
}
