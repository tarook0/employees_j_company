package com.codegym.test;

public class FullTimeEmployee extends Employee {
   private int Salary;
    FullTimeEmployee( int Nu,String Id,String Ad,int [] Bdh,int S,int YN,int vacation ,Section S1){
        SetSalary(S);
        YearsNumber=YN;
        SetId(Nu);
        SetName(Id);
        SetAddress(Ad);
        SetBirthDayDate(Bdh);
        S13=S1;
        calcLeave(YearsNumber,15);
    }
    FullTimeEmployee(){

    }
    void SetSalary(int Salary){
        this.Salary=Salary;
    }
    int getSalary(){
        return Salary;
    }
    void SetYearNumber(int YearsNumber){
        this.YearsNumber=YearsNumber;
    }
    int getYearNumber(){
        return YearsNumber;
    }
    void UpdateYear(int YN){    //FIX ME
        YN++;
    }

     public int calcLeave(int YN,int Vac){

        if(YN<=10){
            SetVac(YN+Vac);
            return YN+Vac;
        }else if(YN<=15){
            SetVac(10+Vac);
            return 10+Vac;
        }
        else{
            SetVac(10+Vac+((YN-15)/2));
            return 10+Vac+((YN-15)/2);
        }
    }
    public void Report(){
        if (YearsNumber>15){
            System.out.println("LSE");
        }
        else {
            System.out.println("FSE");
        }
        super.Report();
         System.out.println("\t"+"\t"+"\t"+"\t"+"Vacation="+(calcLeave(YearsNumber,15))+"\t"+"\t"+"\t"+"\t"+"\t"+"Salary ="+Salary);
    }
}
