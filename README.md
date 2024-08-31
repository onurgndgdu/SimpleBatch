# Spring Batch

This project was created to demonstrate the use of the Spring Batch framework. Spring Batch is a framework used to easily manage and automate batch data processing scenarios.

Project Description
This project simulates a simple data processing scenario. It reads user data in CSV format, processes it, and saves the results to the database. The main components are as follows:

Data Reading: The user data from the CSV file is read using FlatFileItemReader.
Data Processing: Each user record read from the file is processed by CustomerItemProcessor. During this process, transformations and manipulations can be performed on the user data.
Data Writing: The processed user data is written to the database using JdbcBatchItemWriter.
Scheduled Job: The data processing task is automatically executed at specified intervals using the @Scheduled annotation.

### Usage
Add a sample CSV file named User.csv under the src/main/resources directory of the project. This file should contain user data.
Configure the database connection details in the src/main/resources/application.properties file.
Run the project using:

bash
./mvnw spring-boot:run
Once the project is running, the user data from the CSV file will be processed and saved to the database at regular intervals.
