package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.Name, employee.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f%n", employee.Name, employee.NetSalary());
    }
}
