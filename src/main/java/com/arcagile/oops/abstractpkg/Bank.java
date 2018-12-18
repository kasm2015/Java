package com.arcagile.oops.abstractpkg;

import com.arcagile.oops.interfacepkg.BankInterface;

abstract class Bank implements BankInterface {
    //One or more abstract method should be available in abstract
    abstract int getRateOfInterest();

    //Abstract class can also have concrete method
    public String display() {
        System.out.println("inside Bank - display method");
        return  null;
    }

}
