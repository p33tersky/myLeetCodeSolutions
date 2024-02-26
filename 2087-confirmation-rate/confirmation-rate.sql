# Write your MySQL query statement below
SELECT s.user_id, ROUND(IFNULL(SUM(c.action = 'confirmed')/COUNT(*),0),2) AS confirmation_rate
FROM Confirmations c
RIGHT JOIN Signups s ON s.user_id = c.user_id
GROUP BY s.user_id