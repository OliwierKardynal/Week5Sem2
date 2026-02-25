package ie.atu.week5s2.controller;

import ie.atu.week5s2.model.Customer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {

        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}