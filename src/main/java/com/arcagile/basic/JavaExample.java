package com.arcagile.basic;

public class JavaExample {

    //Global/Instance variables
    //Variable declartion
    //One variable
    int a;

    //Multi variable declartion
    int b,c,d;

    //Variable Initilize
    int age = 30;

    //Primitive Data Types
    public Integer a1;
    public String a2;
    public Boolean result;
    public Character character;

    //static variables
    public static String name ="Syed";
    public static int ex;
    //Allocate memory to your static variable/method
    public static void main(String args[]) {
        String name = "Suresh";
        System.out.println("Welcome to Java world!!! , Hello " +name);
        System.out.println("Static variable : " + JavaExample.name);
        System.out.println("Name : " +name);
        System.out.println("Int value : " +ex);
        display();
        typeCasting();
    }

    public static void display() {
        System.out.println(name);
        System.out.println("inside display method");
    }

    public static  void typeCasting() {
        double d = 10.0;
        System.out.println("Double value : " +d);
        //External casting
        int i = (int) d;
        System.out.println("After converting double to integer : " +i);
        int x = 89;
        //Internal type casting
        double z = x;
        System.out.println("Integer to double : " +z);

        //Float to double
        float f = 0.99f;

        //Double
        double d1 = f;
        System.out.println("Converting float to double : " +d1);

        //Long to float
        long l = 10000000;

        //Float
        float f1 = l;

        System.out.println("COnverting long to Float : " +f1);
    }


}
