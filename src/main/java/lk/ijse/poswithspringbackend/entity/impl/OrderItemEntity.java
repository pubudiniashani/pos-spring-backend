package lk.ijse.poswithspringbackend.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orderItems")
public class OrderItemEntity {
    @Id
    private String id;

    private int qty;
    private BigDecimal unitPrice;
    private BigDecimal totalBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId" , nullable = false)
    private OrderEntity order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId" , nullable = false)
    private ItemEntity item;

}
