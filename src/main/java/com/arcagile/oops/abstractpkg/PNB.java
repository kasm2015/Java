package com.arcagile.oops.abstractpkg;

public class PNB extends Bank {
    public Float getHomeLoanRateOfInterest() {
        return null;
    }

    public Float getFDRateOfInterest() {
        return null;
    }

    public Float getRDRateOfInterest() {
        return null;
    }

    int getRateOfInterest() {
        System.out.println("inside PNB - getRateOfInterest");
        return 0;
    }
}
