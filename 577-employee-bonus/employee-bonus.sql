-- Write your PostgreSQL query statement below
SELECT e.name, b.bonus from
employee e left join bonus b
on e.empid=b.empid
WHERE b.bonus < 1000 OR b.bonus IS NULL;