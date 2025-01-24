# Write your MySQL query statement below
with cte as (
    select contest_id,count(distinct user_id) as contest_user_id from register
    group by contest_id
),
cte2 as (
    select count(user_id) as user_id from users
)

select contest_id, Round((contest_user_id)*1.00/(user_id*1.00)*100,2) as percentage from cte
cross join cte2
order by percentage desc, contest_id asc