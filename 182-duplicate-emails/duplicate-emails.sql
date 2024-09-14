# Write your MySQL query statement below
select distinct p1.email from Person p1
JOIN person p2 on p1.email=p2.email and p1.id <> p2.id
