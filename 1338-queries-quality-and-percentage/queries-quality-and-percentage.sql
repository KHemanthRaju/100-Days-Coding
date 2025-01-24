# Write your MySQL query statement below
select query_name, ROUND(AVG(rating*1.00/position),2) as quality, round((sum(case when rating<3 then 1 else 0 end)/count(rating))*100,2) as poor_query_percentage from queries
group by query_name