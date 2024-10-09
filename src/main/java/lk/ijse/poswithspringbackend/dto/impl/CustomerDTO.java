package lk.ijse.poswithspringbackend.dto.impl;

import lk.ijse.poswithspringbackend.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements CustomerStatus {
    private String customerId;
    private String customerName;
    private String address;
    private String contactNumber;
}
