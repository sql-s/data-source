CREATE TABLE CUSTOMERS (
   id int primary key,
   name varchar(100),
   surname varchar(100),
   age int,
   phone_number varchar(15)
);
CREATE TABLE ORDERS (
    id int primary key,
    date varchar(50),
    customer_id int,
    product_name varchar,
    amount int,
    foreign key (customer_id) references customers(id)
);
