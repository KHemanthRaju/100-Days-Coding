# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete p1 from person p1, person p2
where p1.Email = p2.Email and p1.ID > p2.Id