package com.arcagile.oops.inheritance;

public class Programmer extends Employee {

       int bonus = 10000;

       public static void main(String args[]) {
           Programmer p = new Programmer();
           System.out.println("Programmer Salary is : " +p.salary);
           System.out.println("Programmer bonus is : " +p.bonus);
           System.out.println("Calling Employee method : "+p.displaySalary());
       }
}
