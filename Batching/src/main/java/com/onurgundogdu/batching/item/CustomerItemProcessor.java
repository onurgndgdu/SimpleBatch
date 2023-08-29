package com.onurgundogdu.batching.item;

import com.onurgundogdu.batching.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

    private static final Logger log = LoggerFactory.getLogger(CustomerItemProcessor.class);

    @Override
    public Customer process(final Customer customer) throws Exception {
        final String firstName = customer.getFirstName().toUpperCase();
        final String lastName = customer.getLastName().toUpperCase();
        final int age = customer.getAge();
        final String email = customer.getEmail();
        final String phoneNumber = customer.getPhoneNumber();

        final Customer transformedCustomer = new Customer(firstName, lastName, age, email, phoneNumber);

        log.info("Converting ({}) into ({})", customer, transformedCustomer);

        return transformedCustomer;
    }
}
