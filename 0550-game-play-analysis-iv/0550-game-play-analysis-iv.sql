WITH a AS (
    SELECT player_id, MIN(event_date) AS event_date 
    FROM Activity 
    GROUP BY player_id 
)
SELECT ROUND(COUNT(b.event_date)/ COUNT(*), 2) AS fraction 
FROM Activity b
RIGHT JOIN a
ON b.player_id = a.player_id 
AND 
DATE_SUB(b.event_date, INTERVAL 1 DAY) = a.event_date