# Write your MySQL query statement below
select p.project_id, Round(avg(e.experience_years),2) as average_years from Project p
Join Employee e on e.employee_id=p.employee_id
group by p.project_id
