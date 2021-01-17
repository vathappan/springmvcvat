package com.springmicro.springmvcvat.web.controller;

import com.springmicro.springmvcvat.services.CustomerService;
import com.springmicro.springmvcvat.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCust = customerService.saveCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cust_Location", "/api/assignment/customer/" + savedCust.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerID}")
    public ResponseEntity handlePut(@PathVariable("customerID") UUID customerID, @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(customerID, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerID") UUID customerID) {
        customerService.deleteById(customerID);

    }
}
