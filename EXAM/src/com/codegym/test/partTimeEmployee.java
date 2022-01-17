package com.codegym.test;

public class partTimeEmployee extends Employee {
    private int workingHours;
    private int pricePerHour;

    protected partTimeEmployee( int Id,String Na,String Ad,int [] Bdh,int WN,int Pph,Section S1){
        workingHours =WN;
        pricePerHour=Pph;
        SetId(Id);
        SetName(Na);
        SetAddress(Ad);
        SetBirthDayDate(Bdh);
        S13=S1;
        isPartTime=true;

    }
    partTimeEmployee(){

    }
    int calcleave_4_(int WH,int pricePerHour){
        int price=0;
        price=WH*pricePerHour;
       return price;
    }
    void Report(){
        System.out.println("PTE");
        super.Report();
        System.out.println("\t"+"\t"+"\t"+"\t"+"price ="+calcleave_4_(workingHours,pricePerHour));
    }
}
