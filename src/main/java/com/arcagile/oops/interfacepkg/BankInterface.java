package com.arcagile.oops.interfacepkg;

public interface BankInterface {

    /**
     *
     * @return By default methods inside interface is public static abstract
     */
    static Integer a = 0;

    //return home loan rateOfInterest
    Float getHomeLoanRateOfInterest();

    //method fixed deposit rateOfInterest
    Float getFDRateOfInterest();

    //returns recurring deposit rate of interest
    Float getRDRateOfInterest();


}
