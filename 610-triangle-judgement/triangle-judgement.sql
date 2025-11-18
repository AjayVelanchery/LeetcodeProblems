-- Write your PostgreSQL query statement below
(select *, 'Yes' as triangle
from triangle
where (x+y>z) and (x+z>y) and (y+z>x))

union

(select *,'No'as triangle
from triangle
where (x+y<=z) or (x+z<=y)  or (y+z<=x))