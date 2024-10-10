create table customer(
cust_id varchar(10) primary key,
cust_name varchar(20),
cust_phone bigint,
cust_address varchar(20))

create table delivery_partner (
partner_id varchar(10) primary key,
partner_name varchar(15),
rating bigint)

create table pizza(
pizza_id varchar(10) primary key,
cust_id varchar(10),
partner_id varchar(10),
pizza_name varchar(15),
pizza_type varchar(15),
order_date date,
amount bigint)
alter table pizza add foreign key (cust_id) references customer(cust_id)
alter table pizza add foreign key (partner_id) references delivery_partner(partner_id)

insert into customer (cust_id, cust_name, cust_phone, cust_address)values
('C001', 'Medha', 9134567890, 'Mysore'),
('C002', 'Dhanu', 9876543210, 'Bangalore')
select* from customer

insert into delivery_partner (partner_id, partner_name, rating)values
('P001', 'Fast Deliveries', 5),
('P002', 'Speedy Service', 4)
select*from delivery_partner

insert into pizza (pizza_id, cust_id, partner_id, pizza_name, pizza_type, order_date, amount)values
('PZ001', 'C001', 'P001', 'Chicken', 'Extra Large', '2024-10-09', 1500),
('PZ002', 'C002', 'P002', 'Margherita', 'Medium', '2024-10-10', 800),
('PZ003', 'C001', 'P001', 'Cheese', 'Extra Large', '2024-10-10', 1800),
('PZ004', 'C002', 'P002', 'Veggie', 'Small', '2024-10-09', 500)
select*from pizza

--Pizza store has decided to give a discount on all Extra large pizza types by 3%.write a query to update the amount for the same.
update pizza set amount=amount*0.97 where pizza_type='Extra Large'
select*from pizza