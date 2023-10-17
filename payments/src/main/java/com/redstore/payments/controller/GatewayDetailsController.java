package com.redstore.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class GatewayDetailsController {

    @GetMapping("/details")
    String getCustomerDetails(){
        return "Payments service up";
    }

}
