# Write your MySQL query statement below
select contest_id, round((count(b.user_id)*1.00/(select count(user_id) from users))*100,2) as percentage
from register b
group by contest_id
order by percentage desc, contest_id asc