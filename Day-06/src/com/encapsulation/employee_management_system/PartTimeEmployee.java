package com.encapsulation.employee_management_system;


    class PartTimeEmployee extends Employee implements Department{

        private double part_hours;
        private double hourly_salary;
        private String department;
        PartTimeEmployee( int employeeId, String name, double part_hours, double hourly_salary,String department,double baseSalary){
            super(employeeId,name,baseSalary);
            this.part_hours = part_hours;
            this.department=department;
            this.hourly_salary=hourly_salary;

        }



        public void calculateSalary () {
            double total_Salary_part = hourly_salary * part_hours;
            System.out.println("Total salary is: "+total_Salary_part);
        }
        public void assignDepartment(){
            System.out.println("Department of employee is "+department);
        }
        public void getDepartmentDetails(){
            System.out.println("Department: "+department);
        }
        void displayDetails(){
            System.out.println("Employee Id: "+getEmployeeId());
            System.out.println("Employee name: "+getName());
            System.out.println("Base salary: "+getBaseSalary());
        }

    }

