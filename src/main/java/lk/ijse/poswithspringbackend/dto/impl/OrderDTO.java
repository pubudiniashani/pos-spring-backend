package lk.ijse.poswithspringbackend.dto.impl;

import lk.ijse.poswithspringbackend.entity.impl.CustomerEntity;
import lk.ijse.poswithspringbackend.entity.impl.OrderItemEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private String orderId;
    private CustomerEntity customer;
    private List<OrderItemEntity> orderitems;
    private BigDecimal total;
    private Date date;
}
