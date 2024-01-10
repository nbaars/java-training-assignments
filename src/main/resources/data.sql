-- In a real application, you would use a migration tool like Flyway or Liquibase
-- to manage your database schema. For the sake of simplicity, we will use a
-- simple SQL script to create our database schema.

insert into AUTHORS(name, age) values('J. R. R. Tolkien', 45);
insert into AUTHORS(name, age) values('J. K. Rowling', 56);

insert into BOOKS(title, author_id, year_published, price) values('The Hobbit', 1, 1937, 12.0);
insert into BOOKS(title, author_id, year_published, price) values('The Fellowship of the Ring', 1, 1954, 15.56);
insert into BOOKS(title, author_id, year_published, price) values('The Two Towers', 1, 1954, 67.09);
insert into BOOKS(title, author_id, year_published, price) values('The Return of the King', 1, 1955, 45.0);
insert into BOOKS(title, author_id, year_published, price) values('The Silmarillion', 1, 1977, 34.0);
insert into BOOKS(title, author_id, year_published, price) values('The Lord of the Rings', 1, 1955, 45.0);
insert into BOOKS(title, author_id, year_published, price) values('The Casual Vacancy', 2, 2012, 16.99);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Philosopher''s Stone', 2, 1997, 10.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Chamber of Secrets', 2, 1998, 11.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Prisoner of Azkaban', 2, 1999, 12.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Goblet of Fire', 2, 2000, 13.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Order of the Phoenix', 2, 2003, 14.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Half-Blood Prince', 2, 2005, 15.0);
insert into BOOKS(title, author_id, year_published, price) values('Harry Potter and the Deathly Hallows', 2, 2007, 16.0);