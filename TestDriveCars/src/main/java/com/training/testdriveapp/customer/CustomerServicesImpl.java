package com.training.testdriveapp.customer;

import com.training.testdriveapp.customer.Customer;
import com.training.testdriveapp.customer.CustomerRepository;
import com.training.testdriveapp.customer.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer addNewCustomer(Customer newCustomer) {
        return this.customerRepository.save(newCustomer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Customer deleteCustomer(Integer id) {
        Optional<Customer> customerOpt=this.customerRepository.findById(id);
        this.customerRepository.deleteById(id);
        return customerOpt.get();
    }

    @Override
    public Customer login(LoginDto loginDto) throws CustomerException{
        Optional<Customer> customerOpt=this.customerRepository.findByCustomerEmail(loginDto.getUserName());
        if(customerOpt.isEmpty()){
            throw  new CustomerException("Account does not exists for "+loginDto.getPassword());
        }
        Customer foundCustomer=customerOpt.get();
        if(! foundCustomer.getPassword().equals(loginDto.getPassword()))
            throw new CustomerException("Password does not match");

        return foundCustomer;
    }
    }

