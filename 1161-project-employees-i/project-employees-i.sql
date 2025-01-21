# Write your MySQL query statement below
select p.project_id, round(avg(e.experience_years)*1.00,2) as average_years
from project p
join employee e
on e.employee_id = p.employee_id
group by project_id