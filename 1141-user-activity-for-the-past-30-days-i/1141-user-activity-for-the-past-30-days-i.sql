# Write your MySQL query statement below
select activity_date as day, count(distinct(user_id)) as active_users
FROM Activity
where activity_date between date_add('2019-07-27',INTERVAL-29 day) and '2019-07-27'
group by activity_date