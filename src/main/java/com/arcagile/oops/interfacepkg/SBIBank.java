package com.arcagile.oops.interfacepkg;

public class SBIBank  implements BankInterface {
    public Float getHomeLoanRateOfInterest() {
        System.out.println("inside SBI - getHomeLoadROI");
        return null;
    }

    public Float getFDRateOfInterest() {
        System.out.println("inside  SBI - getFDROI");
        return null;
    }

    public Float getRDRateOfInterest() {
        System.out.println("inside SBI - getRDROI");
        return null;
    }
}
