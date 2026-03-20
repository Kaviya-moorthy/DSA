# Write your MySQL query statement below
select name as Employee from employee as e where salary>(select salary from employee as m where e.managerId=m.id);