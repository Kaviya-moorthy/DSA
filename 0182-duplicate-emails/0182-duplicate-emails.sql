# Write your MySQL query statement below
select distinct p.email as Email from Person as p JOIN Person as m on p.id<>m.id and p.email=m.email;