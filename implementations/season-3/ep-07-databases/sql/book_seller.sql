DROP DATABASE IF EXISTS book_seller;
CREATE DATABASE book_seller;
\c book_seller;

CREATE TYPE book_language AS ENUM ('English', 'Portuguese');

CREATE TABLE publishers(
    id SERIAL,
    name VARCHAR(15) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE authors(
    id SERIAL,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE books(
    isbn INTEGER,
    publisher_id INTEGER,
    author_id INTEGER,
    day DATE NOT NULL,
    title VARCHAR(20) NOT NULL,
    language book_language DEFAULT 'Portuguese',
    PRIMARY KEY (isbn),
    FOREIGN KEY (publisher_id) REFERENCES publishers(id),
    FOREIGN KEY (author_id) REFERENCES authors(id)
);

CREATE TABLE customers(
    id INTEGER,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE loans(
    book_isbn INTEGER,
    customer_id INTEGER,
    loan_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    returned BOOLEAN DEFAULT FALSE,
    ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (book_isbn, loan_DATE),
    FOREIGN KEY (book_isbn) REFERENCES books(isbn) ON DELETE CASCADE,
    FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
);

INSERT INTO publishers(name) VALUES ('Porto Editora');
INSERT INTO authors(name) VALUES ('TOLSTOI');
INSERT INTO books(isbn, publisher_id, author_id, day, title) VALUES (1,1,1,'1964-01-01','O Primo Basilio');
INSERT INTO customers(id, name) VALUES (48,'Rodrigues');
INSERT INTO loans(book_isbn, customer_id) VALUES (1,48);