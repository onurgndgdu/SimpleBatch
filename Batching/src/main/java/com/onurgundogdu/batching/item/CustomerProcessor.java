package com.onurgundogdu.batching.item;

import com.onurgundogdu.batching.input.CustomerInput;
import com.onurgundogdu.batching.model.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<CustomerInput, Customer> {

    @Override
    public Customer process(CustomerInput customerInput) throws Exception {
        Customer customer = new Customer();
        customer.setCustomerId(customerInput.getCustomerId());
        customer.setFirstName(customerInput.getFirstName());
        customer.setLastName(customerInput.getLastName());
        customer.setAge(customerInput.getAge());
        customer.setEmail(customerInput.getEmail());
        customer.setPhoneNumber(customerInput.getPhoneNumber());
        return customer;
    }
}
