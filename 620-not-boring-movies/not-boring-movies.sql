-- Write your PostgreSQL query statement below
select s.id,s.movie,s.description,s.rating from 
cinema s where
s.id%2!=0 and s.description!='boring'
 order by  s.rating desc