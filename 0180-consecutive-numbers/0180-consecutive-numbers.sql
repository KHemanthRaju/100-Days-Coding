# Write your MySQL query statement below

select distinct l1.num as consecutivenums
from logs l1, logs l2, logs l3
where l1.Id = l2.Id - 1
 and l2.Id = l3.Id-1
 and l1.Num = l2.num
 and l2.Num = l3.Num