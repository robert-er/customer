package com.microservice.customer.service;

import com.microservice.customer.domain.Customer;
import com.microservice.customer.exception.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Customer findById(Long id) throws NotFoundException;
}
