# Write your MySQL query statement below

select v.customer_id , count(v.visit_id ) as count_no_trans from
visits v
 LEFT   join
Transactions t
on v.visit_id=t.visit_id
WHERE T.TRANSACTION_ID IS NULL
group by v.customer_id;