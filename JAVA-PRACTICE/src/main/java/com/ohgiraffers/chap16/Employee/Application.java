package com.ohgiraffers.chap16.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("홍길동", 25, "IT", 6000),
                new Employee("김철수", 28, "HR", 3000),
                new Employee("이영희", 30, "IT", 7000),
                new Employee("박민수", 22, "영업", 4000),
                new Employee("최지현", 35, "HR", 3500),
                new Employee("한석봉", 40, "IT", 5000)
        );

        String allNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        List<String> highSalaryIT = employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()) && employee.getSalary() >= 5000)
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        Map<String, Double> averageSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(allNames);
        System.out.println(highSalaryIT);
        System.out.println(averageSalaryByDept);
    }
}


