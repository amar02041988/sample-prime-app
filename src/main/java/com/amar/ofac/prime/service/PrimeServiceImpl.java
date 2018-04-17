package com.amar.ofac.prime.service;

import com.amar.ofac.prime.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class PrimeServiceImpl implements PrimeService {

    public String screen(Customer customer) {

        /**
         * Logic to screen the customer based on compliance rules
         */
        return "CONFIRMED";
    }

}
