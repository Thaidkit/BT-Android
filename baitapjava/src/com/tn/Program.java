package com.tn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private  static Scanner sc = new Scanner(System.in);

    private static List<Employee> employeeList = new ArrayList<>();

    private static void showAllEmployees(){
        for (Employee employee: employeeList) {
            System.out.println("Info employee: " + employee);
        }
    }

    private static void addEmployee(){
        int id, age;
        long salaryRate;
        String name, department, code;

        System.out.println("Enter info: ");
        System.out.print("ID: ");
        id = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Age: ");
        age = sc.nextInt();

        sc.nextLine();
        System.out.print("Department: ");
        department = sc.nextLine();

        System.out.print("Code: ");
        code = sc.nextLine();

        System.out.print("Salary rate: " );
        salaryRate = sc.nextLong();

        Employee employee = new Employee(id, name, age, department, code, salaryRate);

        employeeList.add(employee);
    }

    public static void deleteEmployee(){
        System.out.print("Enter employee's id to be deleted: ");
        int id = sc.nextInt();
        for (Employee employee: employeeList) {
            if (employee.getId() == id){
                employeeList.remove(employee);
                System.out.println("Delete ID " + id + "successfully");
                break;
            }
        }
        System.out.println("Invalid ID or No ID exist. Please check again");

    }
    public static void main(String[] args) {

        employeeList.add(new Employee(1, "Thai", 21, "it", "nv1", 800));
        employeeList.add(new Employee(2, "Quy", 22, "business", "nv2", 500));
        employeeList.add(new Employee(3, "Tuan", 23, "it", "nv3", 1000));
        employeeList.add(new Employee(4, "Viet Anh", 21, "it", "nv4", 1000));
        employeeList.add(new Employee(5, "Hung", 20, "accounting", "nv5", 400));
        employeeList.add(new Employee(6, "Viet", 20, "marketing", "nv6", 300));
        employeeList.add(new Employee(7, "Thang", 25, "it", "nv7", 600));
        employeeList.add(new Employee(8, "Tuan Anh", 24, "technical", "nv8", 500));
        employeeList.add(new Employee(9, "Giang", 19, "technical", "nv9", 500));
        employeeList.add(new Employee(10, "Binh", 19, "marketing", "nv10", 300));

        while (true) {
            System.out.println("\n-------Employee Management-------");
            System.out.println("1. List Employee");
            System.out.println("2. Add New Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    showAllEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    System.out.println("Exited.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter choice again!");
            }
        }
    }
}
