# Write your MySQL query statement below
select p.project_id, ROUND(AVG(e.experience_years), 2) AS average_years from Project p JOIN Employee e ON p.employee_id  = e.employee_id GROUP BY p.project_id;