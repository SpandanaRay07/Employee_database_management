package Sem2_miniproject;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Test {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Employee EmployeeDetails[]=new Employee[500];
        for(int i=0;i<EmployeeDetails.length;i++){
            EmployeeDetails[i]=new Employee();
            System.out.println("Enter employee name,ID and salary");
            String n=sc.nextLine();     //name
            int e=sc.nextInt();     //id
            double s= sc.nextDouble();   //salary
            Date d=new Date();
            System.out.println("Enter the hiring date,month and year");
            int date=sc.nextInt();
            int month=sc.nextInt();
            int year= sc.nextInt();
            d.setDate(date,month,year); //hiredate
            System.out.println("Enter his/her position and contact number");
            sc.next();
            String jp= sc.nextLine();         //position
            String cn= sc.nextLine();         //contact number
            Address a=new Address();
            System.out.println("Enter his/her address details(locality,city name,pin)");
            String l= sc.nextLine();
            String cityn= sc.nextLine();
            int pin= sc.nextInt();
            a.setAddress(l,cityn,pin);  //address

            EmployeeDetails[i].setEmployeeDetails(n,e,s,d,jp,cn,a);
        }
        System.out.println("Manager details ");                         //manager details
        getEmployeeByJobPosition(EmployeeDetails,"Manager");

        System.out.println("Details of Employees hired between 01-04-2022 and 31-03-2023");       //hires between fixed dates
        Date d1=new Date();
        d1.setDate(01,04,2022);
        Date d2=new Date();
        d2.setDate(31,03,2023);

        getEmployeeByHireDate(EmployeeDetails,d1,d2);

        System.out.println("Number of foreign Employees is "+foreignEmployeeCount(EmployeeDetails));   //foreign employees
        System.out.println("Details of Employees with salary range from 150000 and 300000 INR:");      //salary between a range
        getEmployeeBySalary(EmployeeDetails,150000,300000);



    }
    public static void arrangeEmployeeBySalary(Employee[] a){
        for(int i=0;i<a.length;i++){
            if(a[i+1].salary>a[i].salary){
                Employee temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }

    public static void getEmployeeByJobPosition(Employee[] a,String jp){
        for(int i=0;i<a.length;i++){
            if(a[i].jobPosition==jp)
                a[i].showEmployeeDetails();
        }
    }
    public static void getEmployeeByHireDate(Employee[] a,Date d1,Date d2) {
        for (int i = 0; i < a.length; i++) {
            if ((a[i].hireDate.date >= d1.date && a[i].hireDate.month >= d1.month && a[i].hireDate.year >= d1.year) && (a[i].hireDate.date <= d2.date && a[i].hireDate.month <= d2.month && a[i].hireDate.year <= d2.year)) {
                a[i].showEmployeeDetails();
            }
        }
    }

        public static int foreignEmployeeCount(Employee[] a){
            int count =0;
            for(int i=0;i<a.length;i++){
                if(a[i].contactNumber.charAt(0)!=9 && a[i].contactNumber.charAt(1)!=1)
                    count++;
            }
            return count;
        }

        public static void getEmployeeBySalary(Employee[] a,double s1,double s2){
        for(int i=0;i<a.length;i++){
            if(a[i].salary>=s1 && a[i].salary<=s2)
                a[i].showEmployeeDetails();
        }

    }
}
