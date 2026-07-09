-- Last updated: 09/07/2026, 10:08:34
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;