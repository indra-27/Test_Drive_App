package com.training.testdriveapp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServices customerServices;

    @PostMapping("customer")
    public Customer addNewCustomer(@RequestBody Customer customer){
        return this.customerServices.addNewCustomer(customer);

    }

    @GetMapping("customer/getAllCustomers")
    public List<Customer> getAllCustomers(){
        return this.customerServices.getAllCustomers();

    }

    @PutMapping("customer/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return this.customerServices.updateCustomer(customer);

    }

    @DeleteMapping("customer/delete/{id}")
    public Customer deleteCustomerById(@PathVariable Integer id)
    {
        return this.customerServices.deleteCustomer(id);

    }

    @PostMapping("customer/login")
    public Customer login(@RequestBody LoginDto loginDto) throws CustomerException {
        return this.customerServices.login(loginDto);
    }
}
