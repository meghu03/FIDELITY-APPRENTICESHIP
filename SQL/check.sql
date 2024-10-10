create table Supplier (
supplier_id NUMERIC(5)primary key,
supplier_name VARCHAR(150),
address VARCHAR(150),
city VARCHAR(50),
state VARCHAR(15),
country VARCHAR(15),
contact VARCHAR(10))

insert into Supplier (supplier_id, supplier_name, address, city, state, country, contact)values
(1, 'Mohith', '123 Street Name', 'New York', 'NY', 'USA', '9874567890'),
(2, 'Arun', '456 Another St', 'Los Angeles', 'CA', 'USA', '7887654321'),
(3, 'Surya', '789 Main Road', 'Chicago', 'IL', 'USA', '9822334455')
select*from supplier

alter table Supplier
add constraint chk_contact_length
check (length(contact) = 10)