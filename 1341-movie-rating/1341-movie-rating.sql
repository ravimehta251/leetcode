# Write your MySQL query statement below
(
select name as results
from users
inner join movierating using(user_id)
group by user_id
order by count(rating) desc ,name
limit 1

)union all(
select title as results
from movies
inner join movierating using(movie_id)
where created_at like ("2020-02-%")
group by title
order by avg(rating) desc ,title
limit 1 )
