package com.amar.ofac.prime.api;

import com.amar.ofac.prime.model.Customer;
import com.amar.ofac.prime.model.CustomerBo;
import com.amar.ofac.prime.model.CustomerDto;
import com.amar.ofac.prime.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeResourceImpl {

    @Autowired
    private PrimeService primeService;

    @RequestMapping(value = "/prime/customer/screen", method = RequestMethod.POST)
    public ResponseEntity<String> getTransactionStatus(@RequestBody CustomerDto customerDto) {
        Customer customerBo = new CustomerBo(customerDto.getName(), customerDto.getDob());
        return new ResponseEntity<String>(primeService.screen(customerBo), HttpStatus.OK);
    }
}
