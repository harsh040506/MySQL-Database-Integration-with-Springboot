DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           first_name VARCHAR(50) NOT NULL,
                           last_name VARCHAR(50) NOT NULL,
                           email_id VARCHAR(100) NOT NULL
);

-- Inserting records
INSERT INTO employees (first_name, last_name, email_id)
VALUES ('Kaelith', 'Silverstream', 'Kaelith.Silverstream@example.com');

INSERT INTO employees (first_name, last_name, email_id)
VALUES ('Zephyrine', 'Wren', 'Zephyrine.Wren@example.com');

INSERT INTO employees (first_name, last_name, email_id)
VALUES ('Liora', 'Vale', 'Liora.Vale@example.com');

INSERT INTO employees (first_name, last_name, email_id)
VALUES ('Nyssa', 'Frost', 'Nyssa.Frost@example.com');

-- Selecting all records
SELECT * FROM employees;