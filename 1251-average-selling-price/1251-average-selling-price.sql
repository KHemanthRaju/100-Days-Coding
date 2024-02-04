# Write your MySQL query statement below
select p.product_id, IFNULL(round(sum(p.price*s.units)/sum(s.units),2),0) as average_price from Prices p
LEFT JOIN UnitsSold s ON p.product_id = s.product_id
AND s.purchase_date BETWEEN p.start_date and p.end_date
GROUP BY p.product_id;