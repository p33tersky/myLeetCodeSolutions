
SELECT r.contest_id,
ROUND(100*COUNT(DISTINCT(r.user_id)) / (SELECT COUNT(DISTINCT(user_id)) FROM Users) , 2) AS "percentage"
FROM Register r
JOIN Users u
ON r.user_id = u.user_id
GROUP BY r.contest_id
ORDER BY percentage desc, contest_id asc




