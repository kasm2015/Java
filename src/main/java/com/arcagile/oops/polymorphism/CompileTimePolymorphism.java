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

    public Integer age;
    public String gender;
    //Constructor
    public CompileTimePolymorphism() {
        //default constructor gets invoked whenever you user create an object
        System.out.println("Default constructor is invoked");
        age = 30;
        gender = "male";
    }

    public static void main(String args[]) {
        //Creating an object for a class
        //Instantiate an object
        CompileTimePolymorphism oopsExample = new CompileTimePolymorphism();
        System.out.println("Age : " +oopsExample.age);
        System.out.println("Gender : " +oopsExample.gender);


        //Compile Time Polymorphism
        Integer totalSalary = oopsExample.totalSalary();
        System.out.println("Total salary without parameters : " +totalSalary);

        Integer totalSalary1 = oopsExample.totalSalary(10000,3000);
        System.out.println("Total salary with 2 parameters : " +totalSalary1);

        Integer totalSalary2 = oopsExample.totalSalary(8000,4000,2000);
        System.out.println("Total salary with 3 parameters : " +totalSalary2);
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
