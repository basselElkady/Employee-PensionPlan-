package org.example;

import org.example.modules.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;


public class Main {

    public static List<Employee> sortEmployee(List<Employee> employees){
        return employees.stream().sorted(
                Comparator.comparing(
                        Employee::getYearlySalary
                ).thenComparing(
                        Employee::getLastName
                )
                ).collect(Collectors.toList());
    }
    public static List<Employee> getQualifiedEmployee(List<Employee> employees){
        return employees.stream().filter(
                e -> (e.getEmploymentDate().isBefore(LocalDate.now().minusYears(3))
                || e.getEmploymentDate().isEqual(LocalDate.now().minusYears(3)))
                && (e.getPensionPlan() == null)
        ).collect(Collectors.toList());
    }

    public static void printJson(List<Employee> employees){
        employees.forEach(e-> e.printJson(e));
    }



    public static void main(String[] args) {
        Employee e1= new Employee(1L,"Bassel","Ahmed", LocalDate.of(2018,1,1),new BigDecimal("20.00"),
                "Ex1",LocalDate.of(2023,2,2),new BigDecimal("1"));
        Employee e2= new Employee(1L,"Bakr","Abdelhamid", LocalDate.of(2018,1,1),new BigDecimal("20.00") );
        Employee e3= new Employee(1L,"Diaa","ibrahim", LocalDate.of(2024,1,1),new BigDecimal("20.00") );

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        printJson(sortEmployee(employees));
        System.out.println("_______________________________________________ \n");
        printJson(getQualifiedEmployee(employees));
        //System.out.println("Hello world!");
    }
}