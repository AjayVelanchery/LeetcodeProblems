select today.id from
weather as today inner join
weather as yesterday
on yesterday.recordDate+interval '1 day'=today.recordDate
where today.temperature>yesterday.temperature
