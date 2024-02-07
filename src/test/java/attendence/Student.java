package attendence;

import org.junit.jupiter.api.Test;

public class Student {
    String name;
    int rollNum;
    int days;
    String className;

    int noOfDayAttended;
    int TotalnoOfDays;


    public Student(String name, int rollNum, int days, String className, int TotalnoOfDays){
        this.name = name;
        this.rollNum = rollNum;
        this.days = days;
        this.className = className;
        this.TotalnoOfDays=TotalnoOfDays;
    }
     public int result(){
         TotalnoOfDays = days-TotalnoOfDays;
        if(TotalnoOfDays < 10){

             //TotalnoOfDays=noOfDays/100;0000000
            System.out.println("Absent Days: "+TotalnoOfDays+" Elegible");

     }else {
            System.out.println("Not Eligible");
        }

        return TotalnoOfDays;
    }
    }
