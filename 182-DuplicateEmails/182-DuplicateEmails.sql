-- Last updated: 09/07/2026, 10:08:28
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;