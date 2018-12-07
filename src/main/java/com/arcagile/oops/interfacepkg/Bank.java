package com.arcagile.oops.interfacepkg;

public class Bank {

    public static void main(String args[]) {
        ICICIBankInterface icici = new ICICIBankInterface();
        System.out.println(icici.getHomeLoanRateOfInterest());
        System.out.println(icici.getFDRateOfInterest());
        System.out.println(icici.getRDRateOfInterest());


        SBIBank sbi = new SBIBank();
        System.out.println(sbi.getHomeLoanRateOfInterest());
        System.out.println(sbi.getFDRateOfInterest());
        System.out.println(sbi.getRDRateOfInterest());
    }
}
