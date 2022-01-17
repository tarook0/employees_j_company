package com.codegym.test;

import java.util.Arrays;

public class Employee {
    private int Vacation=15;
    private int Number;
    private String Name;
    private String  Address;
    protected int YearsNumber;
    private int  birthDayDate[]=new int [3];
    public Section S13;
    public boolean isPartTime=false,isActive=true;
    Employee( int Nu,String Na,String Ad,int [] Bdh, Section S1){
        SetId(Nu);
        SetName(Na);
        SetAddress(Ad);
        SetBirthDayDate(Bdh);
        S13=S1;
    }
    Employee(){

    }
    public int calcLeave(int YN,int Vac){
        return -1;
    }
    void SetVac(int Vacation){
        this.Vacation=Vacation;
    }
    int getVac(){
        return Vacation;}
        void SetId(int Number){
        this.Number=Number;
    }
     int getId(){
        return Number;
    }
    void SetName(String Name){
        this.Name=Name;
    }
    String getName(){
        return Name;
    }
    void SetAddress(String Address){
        this.Address=Address;
    }
    String getAddress(){
        return Address;
    }
    void SetBirthDayDate(int A[]){
            birthDayDate[0]=A[0];
            birthDayDate[1]=A[1];
            birthDayDate[2]=A[2];
    }
    int[] getBirthDayDate(){
        return birthDayDate;
    }

    String getSectionName(){
        return S13.NameSection;
    }
    int getSectionInfo(){
        return S13.InfoSection;
    }
    Employee getSectionBoos(){
        return S13.boosSection;
    }
    void Report(){
        System.out.println("\t"+"\t"+"\t"+"\t"+" Name ="+"\t"+Name+"\t"+"\t"+"\t"+"\t"+" Id :"+"\t"+Number+"\t"+"\t"+"\t"+"\t"+"Address = "+"\t"+Address+"\t"+"\t"+"\t"+"\t"+" birthday ="+"\t"+ Arrays.toString(birthDayDate));
        if(isActive){
            System.out.println("\t"+"\t"+"\t"+"\t"+"This Employee is Active");
        }else{
            System.out.println("\t"+"\t"+"\t"+"\t"+"This Employee is out of service");
        }
    }

}