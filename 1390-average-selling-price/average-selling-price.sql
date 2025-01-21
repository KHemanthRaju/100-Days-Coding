# Write your MySQL query statement below
-- With cte as
-- (
--     select a.product_id, price, units, price*units as sales
--     from prices a
--     left join unitssold b
--     on a.product_id = b.product_id
--     where b.purchase_date between a.start_date and a.end_date
-- )

-- select product_id, coalesce(round(sum(sales)/sum(units)*1.00,2),0) as average_price
-- from cte
-- group by product_id

# Write your MySQL query statement below
With cte as
(
    select a.product_id,
    price,
    units,
    Price*units as sales
    from prices a
    left join unitssold b
    on a.product_id = b.product_id
    and b.purchase_date between a.start_date and a.end_date
)

select product_id, coalesce(round(sum(Sales)/sum(units)*1.00,2),0) as average_price
from cte
group by product_id