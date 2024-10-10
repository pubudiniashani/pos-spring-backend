package lk.ijse.poswithspringbackend.dto.impl;

import lk.ijse.poswithspringbackend.entity.impl.ItemEntity;
import lk.ijse.poswithspringbackend.entity.impl.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemDTO {
    private String id;
    private int qty;
    private BigDecimal unitPrice;
    private BigDecimal totalBalance;
    private OrderEntity order;
    private ItemEntity item;

}
