package com.training.testdriveapp.customer;

import com.training.testdriveapp.customer.Customer;
import com.training.testdriveapp.customer.CustomerRepository;
import com.training.testdriveapp.customer.CustomerServices;
import com.training.testdriveapp.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private  AddressRepository addressRepository;
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
    public void deleteCustomer(Integer id) {
        Optional<Customer> customerOpt=this.customerRepository.findById(id);
        if(customerOpt.isPresent()){
//            this.customerRepository.deleteById(id);
//            Optional<Address> addressOpt=this.addressRepository.findById(id);
//            this.addressRepository.deleteById(id);
            Customer customer=customerOpt.get();
            Address address=customer.getAddress();


            addressRepository.delete(address);
            customerRepository.delete(customer);
        }

        else {
            // Handle the case when the customer with the given ID is not found
            throw new RuntimeException("Customer not found with id: " + id);
        }


        //return addressOpt.get();
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

