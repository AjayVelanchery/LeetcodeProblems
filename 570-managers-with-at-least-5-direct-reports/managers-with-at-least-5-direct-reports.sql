-- Write your PostgreSQL query statement below
select e.name from
employee e  join employee a
on e.id=a.managerId
GROUP BY e.id, e.name

having count(a.managerId)>=5