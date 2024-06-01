# Write your MySQL query statement below
select * from patients
where conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%';