with employee_common as(
    select e.employee_id emp_id,s.employee_id sal_id from employees e left join salaries s on e.employee_id=s.employee_id
)
,salary_common as(
    select s.employee_id sal_id,e.employee_id emp_id from employees e right join salaries s on e.employee_id=s.employee_id 
)
select emp_id employee_id from employee_common where sal_id is null
union
select sal_id from salary_common where emp_id is null order by
employee_id;