package com.arcagile.oops.interfacepkg;

import com.arcagile.oops.polymorphism.RunTimeInterface;

public class ICICIBankInterface implements BankInterface,RunTimeInterface {


    public Float getHomeLoanRateOfInterest() {
        System.out.println("inside ICICI - getHomeROI");
        return null;
    }

    public Float getFDRateOfInterest() {
        System.out.println("inside ICICI - getFDROI");
        return null;
    }

    public Float getRDRateOfInterest() {
        System.out.println("inside ICICI - getRDROI");
        return null;
    }

    public String totalSalary() {
        return null;
    }
}
