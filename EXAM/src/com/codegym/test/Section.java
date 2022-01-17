package com.codegym.test;

public class Section  {
    protected int InfoSection;
    protected String NameSection;
    protected Employee boosSection;
    Section(int InfoSection,String NameSection,Employee  boosSection) {
        SetSection(InfoSection,NameSection,boosSection);
    }
        void SetSection( int InfoSec, String NaSec ,Employee BoSec){
            boosSection =BoSec;
            InfoSection =InfoSec;
            NameSection =NaSec;

    }
String getSectionName(){
        return NameSection;
}
    int getSectionInfo(){
        return InfoSection;
    }
    Employee getSectionBoos(){
        return boosSection;
    }


}
