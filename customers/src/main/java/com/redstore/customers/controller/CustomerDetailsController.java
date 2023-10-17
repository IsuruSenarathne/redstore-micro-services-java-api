package com.redstore.customers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerDetailsController {

    @GetMapping("/details")
    String getCustomerDetails(){
        return "Customer details service up";
    }

}
