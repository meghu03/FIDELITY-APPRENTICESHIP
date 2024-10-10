create table tblCustomers(CustomerID int primary key,
CompanyName varchar(50) not null,
Address varchar(100),
City varchar(50),
PostalCode varchar(50), 
Country varchar(50) DEFAULT 'Canada',
Phone varchar(50));

create table tblShippers(ShipperID int primary key, 
CompanyName varchar(50) unique not null)

create table tblOrders(OrderID INT PRIMARY KEY,
CustomerID INT,
EmployeeID INT,
ShipName VARCHAR(50),
ShipAddress VARCHAR(100),
ShipCity VARCHAR(50),
ShipPostalCode VARCHAR(50),
ShipCountry VARCHAR(50),ShipVia INT,
OrderDate DATE not null,
RequiredDate DATE,
ShippedDate DATE)

create table tblproducts(ProductID int primary key, 
CategoryID int,
ProductName varchar(50) not null, 
UnitsOnOrder int, 
UnitPrice decimal(10,2),
unitsinstock int)      

drop table tblorderdetails
create table tblOrderdetails(orderid int,
productid int,
unitprice decimal(10,2) not null,
quantity int not null check(quantity>10)) 

alter table tblorders add foreign key (customerid) references tblcustomers(customerid)
alter table tblorders add foreign key (shipvia) references tblshippers(shipperid)     
alter table tblorders add constraint chk_shippeddate CHECK (shippeddate > orderdate)
alter table tblorderdetails add foreign key (orderid) references tblorders(orderid)
alter table tblorderdetails add foreign key (productid) references tblproducts(productid)

insert into tblcustomers(customerid,companyname,address,city,postalcode,country,phone)values
(1,'global distributors','global ave','toronto','1e3','canada','555-5678'),
(2,'tech innovators','tech street','new york','1001','canada','534-5778'),
(3,'pinaccle','pinaccle rd','vancouver','234','canada','575-5678')
select*from tblcustomers

insert into tblshippers(shipperid, companyname)values
(1,'delivery inc'),
(2,'speed express'),
(3,'courier solutions')
select*from tblshippers

insert into tblorders(orderid,customerid,employeeid,shipname,shipaddress,shipcity,shippostalcode,shipcountry,shipvia,orderdate,requireddate,shippeddate)values
(20,1,5,'tech innovators','tech street','new york','1001','usa',1,'2024-10-01','2024-10-05','2024-10-03'),
(21,2,6,'global distributers','global ave','toronto','1e3','canada',2,'2024-09-15','2024-09-20','2024-09-18'),
(22,3,7,'pinaccle','pinaccle rd','vancouver','234','canada',3,'2024-08-22','2024-08-30','2024-08-25')
select* from tblorders

insert into tblproducts(productid, categoryid,productname, unitprice,unitsinstock,unitsonorder)values
(1,101,'laptop',22000.00,50,10),
(2,102,'smartphone',8000.00,150,20),
(3,103,'tablet',5000.00,100,15)
select*from tblproducts

insert into tblorderdetails(orderid,productid,unitprice,quantity)values
(20,1,22000.00,15),
(21,2,8000.00,20),
(22,3,5000.00,12)
select*from tblorderdetails

alter table tblshippers add shipperemail varchar(25)
update tblshippers set shipperemail='info@deliveryinc.com' where shipperid=1
update tblshippers set shipperemail='info@speedexpress.com' where shipperid=2
update tblshippers set shipperemail='info@couriersolutions.com' where shipperid=3
select*from tblshippers

alter table tblorders drop column employeeid
select *from tblorders

insert into tblorderdetails(orderid,productid,unitprice,quantity)values
(20,1,22000.00,2)       --constraint is violated--