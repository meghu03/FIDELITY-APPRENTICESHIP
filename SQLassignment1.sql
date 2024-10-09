create table customers( 
customer_id varchar(10) primary key,
customer_name varchar(20),address varchar(20),
phone_no bigint,
email_id varchar(20))

create table delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20),
phone_no bigint,
rating int)

create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20),
hotel_type varchar(20),
rating int)

create table orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int)
alter table orders add foreign key (customer_id) references customers(customer_id)
alter table orders add foreign key (hotel_id) references hotel_details(hotel_id)
alter table orders add foreign key (partner_id) references delivery_partners(partner_id)

insert into customers (customer_id, customer_name, address, phone_no, email_id)values
('CUST1001', 'THOMAS', 'KOCHI', 9856325486, 'thomas@gmail.com'),
('CUST1002', 'CHARLES', 'ALLEPY', 9856367486, 'charles@gmail.com'),
('CUST1003', 'SUDHAKAR', 'KOCHI', 9856323869, 'sudhakar@gmail.com'),
('CUST1004', 'JAGADISH', 'ERNAKULAM', 9856326666, 'jagadish@gmail.com'),
('CUST1005', 'ALBERT', 'ALLEPY', 9856328659, 'albert@gmail.com'),
('CUST1006', 'ASHWIN DAS', 'KANNUR', 9856325659, 'ashwin@gmail.com')
select*from customers

insert into delivery_partners (partner_id, partner_name, phone_no, rating)values 
('PART1001', 'John', 9856341234, 4),
('PART1002', 'Priya', 9856345678, 3),
('PART1003', 'Smitha', 9856349876, 5),
('PART1004', 'David', 9856321548, 2),
('PART1005', 'Meera', 9856398765, 4)
select*from delivery_partners

insert into hotel_details (hotel_id, hotel_name, hotel_type, rating)values
('HOTEL1001', 'The Grand', '5-Star', 5),
('HOTEL1002', 'City Lodge', '3-Star', 3),
('HOTEL1003', 'Sea View', '4-Star', 4),
('HOTEL1004', 'Hilltop ', '3-Star', 3),
('HOTEL1005', 'Royal Stay', '5-Star', 5)
select*from hotel_details

insert into orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount)values
('ORD1001', 'CUST1001', 'HOTEL1001', 'PART1001', '2024-10-01', 1000),
('ORD1002', 'CUST1002', 'HOTEL1002', 'PART1002', '2024-10-02', 2000),
('ORD1003', 'CUST1003', 'HOTEL1003', 'PART1003', '2024-10-03', 3000),
('ORD1004', 'CUST1004', 'HOTEL1004', 'PART1004', '2024-10-04', 4000),
('ORD1005', 'CUST1005', 'HOTEL1005', 'PART1005', '2024-10-05', 5000)
select*from orders

--1. Delivery Partner details based on rating--
select partner_id,partner_name,phone_no from delivery_partners where rating between 3 and 5 order by partner_id

--2. Hunger eats - update table--
update customers set phone_no=9876543210 where customer_id='CUST1004'
select*from customers

--3. Customers having gmail id--
select customer_id, customer_name, address, phone_no from customers
where email_id like '%gmail.com' order by customer_id

--4. Hunger eats - change datatype--
alter table customers modify customer_id int

--5. Hunger eats - Change the field name--
alter table hotel_details rename column rating to hotel_rating

--6. Hotel_info--
select concat('hotel_info',hotel_name,'is a',hotel_type,'hotel')as hotel_info
from hotel_details order by hotel_name desc

--7. Hotels that took order more than five times--
select h.hotel_id,h.hotel_name,count(o.order_id)as no_of_orders
from hotel_details h join orders o on h.hotel_id=o.hotel_id
group by h.hotel_id,h.hotel_name having count(o.order_id)>5 order by h.hotel_id asc

--8. Hotels not taken orders in a specific month--
select h.hotel_id, h.hotel_name, h.hotel_type from hotel_details h
left join orders o on h.hotel_id = o.hotel_id and o.order_date >='2019-05-01' and o.order_date <'2019-06-01'
where o.order_id is null order by h.hotel_id asc

--9. Order details--
select o.order_id, c.customer_name, h.hotel_name, o.order_amount from orders o
join customers c on o.customer_id = c.customer_id join hotel_details h on o.hotel_id = h.hotel_id
order by o.order_id asc





