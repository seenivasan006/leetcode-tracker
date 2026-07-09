-- Last updated: 09/07/2026, 10:08:26
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);