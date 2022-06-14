SELECT *
FROM customers c -- tabla A 
INNER JOIN orders o -- tabla B
ON c.customerNumber = o.customerNumber
and c.customerNumber = 496
ORDER BY o.orderDate DESC;

SELECT * 
FROM orderdetails od
INNER JOIN products p
ON od.productCode = p.productCode
ORDER BY p.productName DESC;

SELECT *
FROM orders o 
INNER JOIN orderdetails od 
ON o.orderNumber = od.orderNumber
AND o.status = 'Cancelled';
