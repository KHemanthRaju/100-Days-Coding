# Write your MySQL query statement below
select s.user_id, Round(Sum(Case when c.action='confirmed' then 1 else 0 end)/count(*),2) as confirmation_rate
from signups s
left join confirmations c
on s.user_id = c.user_id
group by user_id