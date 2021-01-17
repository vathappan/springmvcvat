package com.springmicro.springmvcvat.services;

import com.springmicro.springmvcvat.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerByID(UUID customerID);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerID, CustomerDto customerDto);

    void deleteById(UUID customerID);
}
