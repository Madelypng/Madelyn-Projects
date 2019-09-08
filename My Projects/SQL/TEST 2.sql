SELECT e.employee_id as EmployeeID, CONCAT(e.first_name," ", e.last_name) AS Employee_Name,
e.department_number AS Department_Number,
length(e.last_name) AS LastNameChar,
d.department_name AS Department,
p.project_number AS Project,
TO_DAYS('2018-04-25') - TO_DAYS('1999-05-15') AS DateDiff,
45000.00 AS Base_Salary


FROM Employees AS e JOIN Departments AS d 
ON e.department_number = d.department_number

JOIN Projects AS p
ON e.employee_id = p.employee_id

WHERE d.department_number = 2
ORDER BY e.last_name




 