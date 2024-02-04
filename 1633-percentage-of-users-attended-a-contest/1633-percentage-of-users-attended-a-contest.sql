SELECT
    r.contest_id,
    ROUND(count(distinct user_id) * 100 /(select count(user_id) from Users) ,2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage desc,r.contest_id
