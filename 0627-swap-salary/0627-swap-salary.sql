# Write your MySQL query statement below
update salary
set
    sex = CASE sex
    when 'm' then 'f'
    else 'm'
end;