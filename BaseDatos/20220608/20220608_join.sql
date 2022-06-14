
-- Forma antigua de filtrar datos.
SELECT c.customerNumber, o.orderNumber, c.customerName
FROM customers c, orders o
where c.customerNumber = o.customerNumber
and c.customerNumber = 496
ORDER BY c.customerNumber desc;

-- INNER JOIN
-- Obtiene todos los datos de la tabla A y la tabla B a traves de una columna en comun.
SELECT *
FROM customers c -- tabla A 
INNER JOIN orders o -- tabla B
ON c.customerNumber = o.customerNumber
and c.customerNumber = 496
ORDER BY o.orderDate DESC;

SELECT *
FROM orders o 
INNER JOIN orderdetails od 
ON o.orderNumber = od.orderNumber
AND o.status = 'Cancelled';

SELECT * 
FROM orderdetails od
INNER JOIN products p
ON od.productCode = p.productCode
ORDER BY p.productName desc;

