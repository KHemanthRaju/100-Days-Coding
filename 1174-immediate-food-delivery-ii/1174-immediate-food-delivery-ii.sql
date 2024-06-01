# Write your MySQL query statement below
select Round(avg(case when order_Date=customer_pref_delivery_date then 1 else 0 end)*100,2) as immediate_percentage
from delivery
where(customer_id, order_date) IN
(
select customer_id, min(order_date)
from delivery
group by customer_id
)