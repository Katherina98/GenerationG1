/*SELECT c.customerNumber, o.orderNumber, c.customerName, o.status, o.comments
FROM customers c, orders o
where c.customerNumber = o.customerNumber
and c.customerNumber = 496
ORDER BY c.customerNumber DESC;
*/

select p.productName , p.productLine, p.quantityInStock
from products p
where p.productLine = 'Motorcycles'
ORDER BY p.quantityInStock DESC;


SELECT p.productName, p.productLine, p.quantityInStock
FROM products p
WHERE p.productName LIKE '%Ford%'
ORDER BY p.productLine asc;

