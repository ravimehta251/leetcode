# Write your MySQL query statement below

select e.name from
employee e
join Employee e1
on e.id=e1.managerId 

group by e.id
HAVING  count(e1.managerId) >=5