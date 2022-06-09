
use generationg1;

SELECT * FROM customers;
SELECT * FROM employees;

select * from customers c;

/* la letra c equivale al alias el cual es una abrevicacion del nombre de la tabla con la que voy a trabajar
*/
select * from customers c
WHERE c.customerName LIKE '%toy%';

-- estamos filtrando por la palabra "toy" y nos muestra los datos de las columnas number, name y city.
select c.customerNumber, c.customerName, c.city
from customers c 
where c.customerName like '%toy%';

-- estamos filtrando por la ciudad y nos muestra los datos de las columnas number, name y city.
select c.customerNumber, c.customerName, c.city
from customers c 
where c.city = 'Madrid';

-- estamos obteniendo todos los registros de ambas tablas, en algunos casos se repite información para realizar el equivalente de datos en las dos tablas
SELECT *
FROM customers c, orders o
ORDER BY c.customerNumber desc;

-- obtener los registros de ambas tablas pero filtrando por los datos a traves de la primary key (en la tabla customer) y la foreign key (en la tabla order)
SELECT *
FROM customers c, orders o
where c.customerNumber = o.customerNumber
ORDER BY c.customerNumber desc;

-- obtener todas las ordenes por cliente a traves de las primary key
SELECT c.customerNumber, o.orderNumber
FROM customers c, orders o
where c.customerNumber = o.customerNumber
ORDER BY c.customerNumber desc;

-- obtener todas las ordenes asociadas a un cliente en especifico
SELECT c.customerNumber, o.orderNumber, c.customerName, o.status
FROM customers c, orders o
where c.customerNumber = o.customerNumber
and c.customerNumber = 496
ORDER BY c.customerNumber desc;

-- filtrar todas las motorcycles mostrando la productLine y textDescription.
select p.productName , pl.productLine, pl.textDescription
from products p , productlines pl
where p.productLine  = pl.productLine
and pl.productLine = 'Motorcycles';

-- 





