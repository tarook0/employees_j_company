package com.codegym.test;

public class longServingEmployee extends Employee {
    private  int YearsNumber;
    private  int Vacation;
    private int salary;
    longServingEmployee( int Nu,String Na,String Ad,int [] Bdh,int YN,int Salary,Section S1){
        YearsNumber=YN;
        SetId(Nu);
        SetName(Na);
        SetAddress(Ad);
        SetBirthDayDate(Bdh);
        setSalary(Salary);
        S13=S1;
        calcLeave(YearsNumber,15);
    }
    longServingEmployee(){

    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /* public int calcLeave(int YN){
        return 10+15+((YN-15)/2);}*/
@Override
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
        System.out.println("LSE");
        super.Report();
        System.out.println("\t"+"\t"+"\t"+"\t"+"Vacation="+calcLeave(YearsNumber,15)+"\t"+"\t"+"\t"+"\t"+"\t"+"Salary="+salary);
    }

}
