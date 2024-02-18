# Write your MySQL query statement below
SELECT A.machine_id, ROUND(AVG(B.timestamp-A.timestamp),3) as "processing_time"
FROM Activity A join Activity B
    ON a.machine_id = b.machine_id 
    AND a.process_id = b.process_id 
    AND a.activity_type = 'start' AND b.activity_type = 'end'
GROUP BY 1;
