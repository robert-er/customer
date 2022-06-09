package com.microservice.customer.service;

import com.microservice.customer.domain.Customer;
import com.microservice.customer.exception.NotFoundException;
import com.microservice.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findById(Long id) throws NotFoundException {
        return customerRepository.findById(id).orElseThrow(() -> new NotFoundException(String.format("Customer with id: %s not found", id)));
    }
}
