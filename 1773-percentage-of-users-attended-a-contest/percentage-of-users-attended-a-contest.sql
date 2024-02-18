
SELECT r.contest_id,
ROUND(100*COUNT(DISTINCT(user_id)) / (SELECT COUNT(DISTINCT(user_id)) FROM Users) , 2) AS "percentage"
FROM Register r
GROUP BY contest_id
ORDER BY percentage desc, contest_id asc




