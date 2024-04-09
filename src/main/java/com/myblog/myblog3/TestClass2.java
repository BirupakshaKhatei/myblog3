package com.myblog.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass2 {
    public static void main(String[] args){
    //    List<Employee> employees = Arrays.asList(
    //            new Employee("biru",24,"chennai"),
    //            new Employee("mike",23,"chennai"),
    //            new Employee("adam",30,"bangalore"),
    //            new Employee("stallin",35,"kolkata")
    //    );

    //    List<Employee> emps = employees.stream().filter(emp -> emp.getAge() >= 30).collect(Collectors.toList());

        //   for (Employee e:emps){
    //        System.out.println(e.getName());
     //       System.out.println(e.getCity());
     //       System.out.println(e.getAge());
     //   }

        List<Integer> numbers = Arrays.asList(10,20,1,13,5,24);
        List<Integer> newNumbers = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n1 -> n1 * n1).collect(Collectors.toList());
        System.out.println(newNumbers);

    }


}
