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

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerID, CustomerDto customerDto) {

    }

    @Override
    public void deleteById(UUID customerID) {

    }

}
