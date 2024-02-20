package com.training.testdriveapp.customer;

import com.training.testdriveapp.customer.Customer;

import java.util.List;

public interface CustomerServices {
    Customer addNewCustomer(Customer newCustomer);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

    Customer login(LoginDto loginDto) throws CustomerException;
}
