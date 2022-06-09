package com.microservice.customer.controller.response;

import com.microservice.customer.dto.CustomerDto;
import com.microservice.customer.exception.NotFoundException;
import com.microservice.customer.mapper.CustomerMapper;
import com.microservice.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequiredArgsConstructor
public class AccountsResponseController {


    private final CustomerMapper customerMapper;
    private final CustomerService customerService;

    @GetMapping("/v1/customer/{customerId}")
    public CustomerDto getCustomer(@PathVariable Long customerId) throws NotFoundException {
        return customerMapper.mapToCustomerDto(customerService.findById(customerId));
    }
}
