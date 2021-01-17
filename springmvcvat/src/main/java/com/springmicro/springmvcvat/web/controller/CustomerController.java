package com.springmicro.springmvcvat.web.controller;

import com.springmicro.springmvcvat.services.CustomerService;
import com.springmicro.springmvcvat.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/assignment/customer/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerID) {
        return new ResponseEntity<>(customerService.getCustomerByID(customerID), HttpStatus.OK);
    }
}
