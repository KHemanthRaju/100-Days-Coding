# Write your MySQL query statement below
# Write your MySQL query statement below
select LEFT(trans_date,7) as month,country, count(*) as trans_count, Sum(state='approved') as approved_count, sum(amount) as trans_total_amount, sum(case when state='approved' then amount else 0 end) as approved_total_amount
from transactions
group by month,country
