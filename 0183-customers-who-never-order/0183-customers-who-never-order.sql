# Write your MySQL query statement below
select c.name AS Customers from customers c LEFT JOIN orders o ON c.id = o.customerId WHERE o.customerId IS NULL;;