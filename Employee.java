package Sem2_miniproject;
public class Employee {
    String name;
    int empId;
    double salary;
    Date hireDate;
    String jobPosition;
    String contactNumber;
    Address address;
   void setEmployeeDetails(String name,int empId,double salary,Date hireDate,String jobPosition,String contactNumber,Address address){
       this.name=name;
       this.empId=empId;
       this.salary=salary;
       this.hireDate=hireDate;
       this.jobPosition=jobPosition;
       this.contactNumber=contactNumber;
       this.address=address;
   }
   void showEmployeeDetails(){
       System.out.println("Name - "+name);
       System.out.println("Employee ID - "+empId);
       System.out.println("Salary - "+salary);
       System.out.println("Hire Date - "+hireDate);
       System.out.println("Job Position - "+jobPosition);
       System.out.println("Contact number - "+contactNumber);
       System.out.println("Address - "+address);
   }
}
