package com.springmicro.springmvcvat.services;

import com.springmicro.springmvcvat.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID customerID) {
        return CustomerDto.builder()
                .id(customerID)
                .customerName("Appu")
                .build();
    }
}
