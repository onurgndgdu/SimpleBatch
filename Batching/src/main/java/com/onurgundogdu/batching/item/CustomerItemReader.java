package com.onurgundogdu.batching.item;

import com.onurgundogdu.batching.input.CustomerInput;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.core.io.ClassPathResource;

public class CustomerItemReader {
    public static FlatFileItemReader<CustomerInput> reader(String path) {
        return new FlatFileItemReaderBuilder<CustomerInput>()
                .name("customerItemReader")
                .resource(new ClassPathResource(path))
                .delimited()
                .names("customer_id", "first_name", "last_name", "age", "email", "phone_number")
                .fieldSetMapper(new BeanWrapperFieldSetMapper<CustomerInput>() {{
                    setTargetType(CustomerInput.class);
                }})
                .build();
    }
}
