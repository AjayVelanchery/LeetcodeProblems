-- Write your PostgreSQL query statement below
select person_name from Queue
where turn=(


    select  q2.turn
    from queue q1,queue q2
    where q1.turn<=q2.turn
    group by q2.turn
    having sum(q1.weight)<=1000
    order by sum(q1.weight)desc
    limit 1
)