# Write your MySQL query statement below
select r.contest_id ,
round(
    count(r.user_id)*100/(select count(*) from users),
    2) 
    as percentage 
from register r

group by r.contest_id 
ORDER BY percentage DESC, r.contest_id;