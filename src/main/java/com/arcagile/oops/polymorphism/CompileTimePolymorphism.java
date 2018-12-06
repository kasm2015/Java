package com.arcagile.oops.polymorphism;

//Class name should be same your file name (CompileTimePolymorphism.java)
public class CompileTimePolymorphism {

    /***
     * Encapsulation
     Access modifier keywords are used for encapsulation in object oriented programming.
     For example, encapsulation in java is achieved using private, protected and public keywords.
     */
    public String firstName;
    private String mobileNumber;
    protected String salary;

    //Constructor
    public CompileTimePolymorphism() {
        //default constructor gets invoked whenever you user create an object
        System.out.println("Default constructor is invoked");
    }

    public static void main(String args[]) {
        //Creating an object for a class
        CompileTimePolymorphism oopsExample = new CompileTimePolymorphism();
    }

    /*
     * CompileTimePolymorphism is the concept where an object behaves differently in different situations.
     * There are two types of polymorphism – compile time polymorphism and runtime polymorphism.
    */
    //METHOD without any parameters
    public Integer totalSalary() {
        Integer basic       = 10000;
        Integer hra         = 3000;
        Integer totalSalary = basic + hra;

        return totalSalary;
    }

    //METHOD with 2 parameters
    public Integer totalSalary(Integer basic,Integer variable) {
        Integer totalSalary = basic + variable;
        return  totalSalary;
    }

    //METHOD with 3 parameters
    public Integer totalSalary(Integer basic, Integer hra, Integer da) {
        Integer totalSalary = basic + hra + da;
        return  totalSalary;
    }




}
