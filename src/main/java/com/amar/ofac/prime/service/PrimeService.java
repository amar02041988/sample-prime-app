package com.amar.ofac.prime.service;

import com.amar.ofac.prime.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface PrimeService {

    public String screen(Customer customer);
}
