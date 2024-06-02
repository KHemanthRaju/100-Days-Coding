SELECT q1.person_name
FROM Queue q1, Queue q2
WHERE q1.turn >= q2.turn
GROUP BY q1.turn
HAVING SUM(q2.weight) <= 1000
LIMIT 1