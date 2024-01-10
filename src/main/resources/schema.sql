-- In a real application, you would use a migration tool like Flyway or Liquibase
-- to manage your database schema. For the sake of simplicity, we will use a
-- simple SQL script to create our database schema.

DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS books;

CREATE TABLE authors
(
    age  INTEGER   NOT NULL,
    id   BIGSERIAL NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE books
(
    price          FLOAT(53) NOT NULL,
    year_published INTEGER   NOT NULL,
    author_id      BIGINT,
    id             BIGSERIAL NOT NULL,
    title          VARCHAR(255),
    PRIMARY KEY (id)
);