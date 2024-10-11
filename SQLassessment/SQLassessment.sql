CREATE TABLE WORKER(
WORKER_ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(50),
LAST_NAME VARCHAR(50),
SALARY INT,
JOINING_DATE DATE,
DEPARTMENT VARCHAR(50))

CREATE TABLE TITLE(
WORKER_REF_ID INT,
WORKER_TITLE VARCHAR(50),
AFFECTED_FROM DATE)
ALTER TABLE TITLE ADD FOREIGN KEY (WORKER_REF_ID) REFERENCES WORKER(WORKER_ID)

CREATE TABLE BONUS(
WORKER_REF_ID INT,
BONUS_AMOUNT INT,
BONUS_DATE DATE)
ALTER TABLE BONUS ADD FOREIGN KEY (WORKER_REF_ID) REFERENCES WORKER(WORKER_ID)

INSERT INTO WORKER(WORKER_ID,FIRST_NAME,LAST_NAME,SALARY,JOINING_DATE,DEPARTMENT)VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin')
SELECT*FROM WORKER

INSERT INTO TITLE (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM)VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11')
SELECT*FROM TITLE

INSERT INTO BONUS (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE)VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16')
SELECT*FROM BONUS

--1. Write a query to display the firstname, salary and title for all workers.
SELECT W.FIRST_NAME,W.SALARY,T.WORKER_TITLE FROM WORKER W JOIN TITLE T ON W.WORKER_ID = T.WORKER_REF_ID

--2. Write a plpgsql function to display the count of worker(s) based on the nth highestsalary.
CREATE FUNCTION get_worker_count_by_nth_highest_salary(nth_highest INT)
RETURNS INT AS
$$
DECLARE
nth_highest_salary DECIMAL;
WORKER_COUNT INT;
-- Find the nth highest salary
BEGIN WITH ranked_salaries AS (
SELECT SALARY, ROW_NUMBER() OVER (ORDER BY SALARY DESC) AS RANK
FROM WORKER )
SELECT SALARY INTO nth_highest_salary FROM ranked_salaries
WHERE RANK = nth_highest;
-- Count workers with the nth highest salary
SELECT COUNT(*) INTO WORKER_COUNT FROM WORKER 
WHERE SALARY = nth_highest_salary;
RETURN worker_count;
END;
$$
LANGUAGE plpgsql;

SELECT get_worker_count_by_nth_highest_salary(1);

--To find the ranks 
SELECT SALARY,ROW_NUMBER() OVER (ORDER BY SALARY DESC) AS salary_rank FROM WORKER
