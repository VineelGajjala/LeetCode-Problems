# Write your MySQL query statement below
SELECT
    a.name AS 'employee'
FROM
    Employee AS A,
    Employee As b
WHERE
    a.ManagerID = b.Id
        AND a.Salary > b.Salary