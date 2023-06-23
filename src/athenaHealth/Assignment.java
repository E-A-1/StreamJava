package athenaHealth;

public class Assignment {

    // 2

    // "put", "put", "get", "put", "get", "put", "get", "get", "get" "put"

    //

    // 1, 2, 1, 3, 2, 4, 1, 3, 4 , 5

}

// 2

Least Recently
Accessed Element

// "put", 1
"put",2"get",1"put",3"get",2"put",4"get",1"get",3"get"4"put"5
//

// 1, 2, 1, 3, 2, 4, 1, 3, 4 , 5

EmployeeDetails

EmpId
FullName ManagerId
DateOfJoining
City

Table–
EmployeeSalary

EmpId
Project
Salary

select emp.FullName,es.salary from
EmployeeDetails emp
left join
EmployeeSalary es
on es.EmpId=emp.
EmpId
