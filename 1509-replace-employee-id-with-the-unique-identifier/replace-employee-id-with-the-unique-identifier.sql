select a.unique_id,e.name

from employees e
left join employeeuni a
on a.id=e.id