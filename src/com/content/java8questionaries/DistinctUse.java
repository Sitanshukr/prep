package com.content.java8questionaries;

/** distinct() function is used to remove all duplicates values from list
 * it returns a new stream with distinct values
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctUse {

    public void removeDuplicates(List<Integer> listofInt){

        List <Integer> distinctValues= listofInt.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctValues);

    }

    public void removeDuplicateEmployee(List<Employee> listofEmp){

        List <Employee> distinctEmp= listofEmp.stream().distinct().collect(Collectors.toList());

        //System.out.println(distinctEmp);
        for (Employee employee : distinctEmp){
            System.out.println(employee.getName() + " " + employee.getAge());
        }

    }

    /*public <T> void remove (List <T> inputList){
       List <T> outputList= inputList.stream().distinct().collect(Collectors.toList());

        for (T employee : outputList){
            System.out.println(e);
        }
    }*/
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,56,34,34,34,67,45,56, 99 ,67);
        DistinctUse distinctUse= new DistinctUse();
      distinctUse.removeDuplicates(list);
        //distinctUse.remove(list);


        List<Employee> employeeList = Arrays.asList(
                new Employee("Guru",34),
                new Employee("Rajesh",32),
                new Employee("Rohan", 56),
                new Employee("Guru", 34)
        );
       distinctUse.removeDuplicateEmployee(employeeList);
       // distinctUse.remove(employeeList);

    }
}
