package com.codegym.test;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int z=0;
    static void deactivate(ArrayList<Employee> AA,int IP){//تابع يقوم بفحص فيما إذا كان الموظف منهية خدماته أو لا
        for(Employee e:AA){
            if(e.getId()==IP) e.isActive=false;
        }
    }
    static void DeleteEmployee(ArrayList<Employee>AA,int empoyeeId){//تابع يقوم بحذف موظف من سجلات الموظفين نهائيا
        for(int i=0;i<AA.size() ;i++){
            if(AA.get(i).getId()==empoyeeId){
                AA.remove(i);
                return;
            }
        }
    }
static void AddVacation(ArrayList<Employee>AA,int empoyeeId,int Vacation_Plus ){ //تابع يقوم بإضافة إجازة إلى أحد الموظفين بتمرير

        for(int i=0;i<AA.size() ;i++){
        if(AA.get(i).getId()==empoyeeId){
        //z= (AA.get(i).calcLeave(AA.get(i).YearsNumber,15))+Vacation_Plus;
        z+=Vacation_Plus;
        }
    }
    return;
}
static void PartTimeEmployeeRecords(ArrayList<Employee>AA) { //تابع يقوم بإظهار سجلات الموظفين المتعاقدين فقط
    for (int i = 0; i < AA.size(); i++) {
        if (AA.get(i).isPartTime)
            AA.get(i).Report();
    }
}
    static void EmployeeRecords(ArrayList<Employee>AA) {//تابع يقوم بإظهار سجلات الموظفن جميعهم
        for (int i = 0; i < AA.size(); i++) {
                AA.get(i).Report();
        }
    }
static int showVacation(ArrayList<Employee>AA,int employeeId){//تابع يقوم بإظهار عدد الإجازات الممنوحة لموظف ما
        for (int i=0 ; i<AA.size();i++)
            if(AA.get(i).getId()==employeeId) {
                return AA.get(i).calcLeave(AA.get(i).YearsNumber,AA.get(i).getVac())+z;
            }
        return -1;
}
static void elementOfSection(ArrayList<Employee>AA,String nameSection){//تابع يقوم بطباعة سجلات الموظفين الموجودين ضمن قسم معين
        for(int i =0;i<AA.size();i++){
            if(AA.get(i).getSectionName().equals(nameSection)){
                AA.get(i).Report();
            }
        }
}
static void EmployeeSectionNumbers(ArrayList<Employee>AA){//تابع يقوم بطباعة السم كل قسم وعدد الموظفين الموجودين بداخله
        int counter;
        for(int i=0 ; i<AA.size();i++){
            counter=0;
            System.out.println("Section"+AA.get(i).getSectionName());
            for(int j=0 ;j<AA.size();j++){
                if(AA.get(i).getSectionName()==AA.get(j).getSectionName())
                counter++;
            }
            System.out.println("the number of employee in this section is :::"+counter);
        }
}

    public static Employee boosFinder (ArrayList<Employee> AA){// تابع يرسل إليه اسم الرآيس للقسم ليقوم بإيجاده
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        for(Employee e:AA){
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int employeeId, salary, yearNumber,  InfoSection,vacation, workingHours, pricePerHour;
        int[] Bdh = new int[3];
        char o='0';
        String employeeName, employeeAddress, NameSection;
        Employee boosSection;
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> AA = new ArrayList<Employee>(); // نستخدم ,Array list , لتخزين سجلات الموظفين
        while (o !='5') {
            System.out.println("please Enter " + "\t" + "1 if you want to insert information about FullTimeEmployee");
            System.out.println("please Enter " + "\t" + "2 if you want to insert information about LongServingEmployee");
            System.out.println("please Enter " + "\t" + "3 if you want to insert information about PartTimeEmployee");
            System.out.println("please Enter " + "\t" + "4 to chose which method that you want to use ::");
            System.out.println("please Enter " + "\t" + "5 to Exit");
            o = input.next().charAt(0);
            Collections.sort(AA, Comparator.comparing(Employee::getId));
            switch (o) {
                case '1':
                    System.out.println("Enter your employeeName please :");
                    employeeName = input.next();
                    System.out.println("Enter your employeeId please :");
                    employeeId = input.nextInt();

                    System.out.println("Enter your employeeAddress please :");
                    employeeAddress = input.next();
                    System.out.println("Enter your employee BirthDay[day,month,year] please :");
                    for (int i = 0; i < Bdh.length; i++) {
                        Bdh[i] = input.nextInt();
                    }
                    System.out.println("Enter your employee Salary please :");
                    salary = input.nextInt();
                    System.out.println("Enter your employee yearNumber please :");
                    yearNumber = input.nextInt();
                    System.out.println("Enter your  EmployeeSection((Info_Name_Boos)) Name please:");
                    System.out.println("Enter your ID EmployeeSection please:");
                    InfoSection=input.nextInt();
                    System.out.println("Enter your  EmployeeSection Name please:");
                    NameSection=input.next();
                    System.out.println("Enter the name  of the boos section");
                    boosSection=boosFinder(AA);
                    Section S2=new Section(InfoSection,NameSection,boosSection);
                    FullTimeEmployee FE1 = new FullTimeEmployee(employeeId, employeeName, employeeAddress, Bdh, salary, yearNumber,15,S2);
                    AA.add(FE1);
                    break;
                case '2':
                    System.out.println("Enter your employeeName please :");
                    employeeName = input.next();
                    System.out.println("Enter your employeeId please :");
                    employeeId = input.nextInt();
                    System.out.println("Enter your employeeAddress please :");
                    employeeAddress = input.next();
                    System.out.println("Enter your employee BirthDay[day,month,year] please :");
                    for (int i = 0; i < Bdh.length; i++) {
                        Bdh[i] = input.nextInt();
                    }
                    System.out.println("Enter your employee Salary please :");
                    salary = input.nextInt();
                    System.out.println("Enter your employee yearNumber please :");
                    yearNumber = input.nextInt();
                    System.out.println("EmployeeSection((IdS_NameS_BoosS))");
                    System.out.println("Enter your Id  EmployeeSection please:");
                    InfoSection=input.nextInt();
                    System.out.println("Enter your  EmployeeSection Name please:");
                    NameSection=input.next();
                    System.out.println("Enter the name  of the boos section");
                    boosSection=boosFinder(AA);
                    Section S3=new Section(InfoSection,NameSection,boosSection);
                    longServingEmployee LE1 = new longServingEmployee(employeeId, employeeName, employeeAddress, Bdh, yearNumber,salary,S3);
                    AA.add(LE1);
                    break;
                case '3':
                    System.out.println("Enter your employeeName please :");
                    employeeName = input.next();
                    System.out.println("Enter your employeeId please :");
                    employeeId = input.nextInt();
                    System.out.println("Enter your employeeAddress please :");
                    employeeAddress = input.next();
                    System.out.println("Enter your employee BirthDay[day,month,year] please :");
                    for (int i = 0; i < Bdh.length; i++) {
                        Bdh[i] = input.nextInt();
                    }
                    System.out.println("Enter your employee WorkingHours please :");
                    workingHours = input.nextInt();
                    System.out.println("Enter your employee PricePerHour please :");
                    pricePerHour = input.nextInt();

                    System.out.println("EmployeeSection((IdS_NameS_BoosS))");
                    System.out.println("Enter your ID EmployeeSection please:");
                    InfoSection=input.nextInt();
                    System.out.println("Enter your  EmployeeSection Name please:");
                    NameSection=input.next();
                    System.out.println("Enter the name  of the boos section");
                    boosSection=boosFinder(AA);
                    Section S4=new Section(InfoSection,NameSection,boosSection);
                    partTimeEmployee PE1 = new partTimeEmployee(employeeId, employeeName, employeeAddress, Bdh, workingHours, pricePerHour,S4);
                    AA.add(PE1);
                    break;
                case'4':
                    char O ='a';
                    System.out.println("Enter the number of  your method that you want to do it");
                    while(O!='e') {
                        System.out.println("please Enter " + "\t" + "a to delete an employee from your list");
                        System.out.println("please Enter " + "\t" + "b to add vacations to an employee");
                        System.out.println("please Enter " + "\t" + "c to print your Part Time Employees records");
                        System.out.println("please Enter " + "\t" + "d to print the vacations of  employee number");
                        System.out.println("please Enter " + "\t" + "g to print section and their employee");
                        System.out.println("please Enter " + "\t" + "f to print the name of your section and the number of his employee::");
                        System.out.println("please Enter " + "\t" + "h to print the Employee you want to end service PLEASE ");
                        System.out.println("please Enter " + "\t" + "i to print your Employee records");
                        System.out.println("please Enter " + "\t" + "e to exit from this list :::: ");
                        O=input.next().charAt(0);
                        switch (O) {
                            case 'a':

                                System.out.println("Enter the ip of your employee that you want to delete him from your list::");
                                employeeId = input.nextInt();
                                DeleteEmployee(AA, employeeId);
                                break;
                            case 'b':
                                System.out.println("Enter the (Id && number of new vacation) of employee that you want to Add to him vacations");
                                employeeId = input.nextInt();
                                vacation = input.nextInt();
                                AddVacation(AA, employeeId, vacation);
                                break;
                            case 'c':
                                System.out.println("Your Records is::");
                                PartTimeEmployeeRecords(AA);
                                break;
                            case 'd':
                                System.out.println("Enter the Id number of employee who you want to show their Vacation");
                                employeeId = input.nextInt();
                                System.out.println(showVacation(AA, employeeId));
                                break;
                            case 'g':
                                System.out.println("Enter the Name of your section that you want to show their employee:: ");
                                NameSection = input.next();
                                elementOfSection(AA, NameSection);
                                break;
                            case 'f':
                                EmployeeSectionNumbers(AA);
                                break;
                            case 'h':
                                System.out.println("Enter the ID of the Employee you want to end service PLEASE:");
                                int IP=input.nextInt();
                                deactivate(AA,IP);
                                break;
                            case 'i':
                                System.out.println("Your Records is::");
                                EmployeeRecords(AA);
                                break;
                                case 'e':
                                break;
                            default:
                                System.out.println("please Enter " + "\t" + "a to delete an employee from your list");
                                System.out.println("please Enter " + "\t" + "b to add vacations to an employee");
                                System.out.println("please Enter " + "\t" + "c to print your Employee records");
                                System.out.println("please Enter " + "\t" + "d to print the vacations of  employee number");
                                System.out.println("please Enter " + "\t" + "g to print section and their employee");
                                System.out.println("please Enter " + "\t" + "f to print the name of your section and the number of his employee::");
                                System.out.println("please Enter " + "\t" + "h to print the Employee you want to end service PLEASE ");
                                System.out.println("please Enter " + "\t" + "i to print your Employee records");
                                System.out.println("please Enter " + "\t" + "e to exit from this list :::: ");
                        }
                    }
                case '5':
                    break;
                default:
                    System.out.println("please Enter " + "\t" + "1 if you want to insert information about FullTimeEmployee");
                    System.out.println("please Enter " + "\t" + "2 if you want to insert information about LongServingEmployee");
                    System.out.println("please Enter " + "\t" + "3 if you want to insert information about PartTimeEmployee");
                    System.out.println("please Enter " + "\t" + "4 to chose which method that you want to use ::");
                    System.out.println("please Enter " + "\t" + "5 to Exit");
            }
        }
    }
}
//Tareq Al habbal
//9
//Dr.Mysaa
