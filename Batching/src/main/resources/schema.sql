DROP TABLE customer IF EXISTS;

CREATE TABLE customer  (
                         customer_id INT IDENTITY NOT NULL PRIMARY KEY,
                         first_name VARCHAR(20),
                         last_name VARCHAR(20),
                         age INT,
                         email VARCHAR(20),
                         phone_number VARCHAR(20)
);