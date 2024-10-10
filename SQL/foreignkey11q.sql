create table salesman (
salesman_id NUMERIC(5)primary key,
name VARCHAR(30),
city VARCHAR(15),
commission DECIMAL(5,2))

create table orders1 (
ord_no NUMERIC(5) PRIMARY KEY,
purch_amt DECIMAL(8,2),
ord_date DATE,
customer_id NUMERIC(5),
salesman_id NUMERIC(5))
alter table orders1 add foreign key (salesman_id) references salesman(salesman_id)

insert into salesman (salesman_id, name, city, commission)values
(1, 'John ', 'New York', 0.15),
(2, 'David', 'Toronto', 0.12),
(3, 'James', 'Chicago', 0.10)
select*from salesman

insert into orders1 (ord_no, purch_amt, ord_date, customer_id, salesman_id)values
(101, 1500.00, '2024-10-01', 2001, 1),
(102, 2000.00, '2024-10-02', 2002, 2),
(103, 3200.00, '2024-10-03', 2003, 1),
(104, 4500.00, '2024-10-04', 2004, 3)
select*from orders1
