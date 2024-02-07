package school;

public class StudentMarksTest {

    public boolean isPassed(Subject subject) {
        System.out.println(" from isPassed " + subject.name);
        return subject.marks >= 35;
    }

    public boolean isPassedInHindi(Subject subject) {
        System.out.println(" from isPasedInHindi " + subject.name);
        return subject.marks >= 21;
    }

    Student getResult(Student inputstudent) {
        if (isPassed(inputstudent.marks.telugu)) {
            inputstudent.marks.telugu.result = "Pass";
        } else {
            inputstudent.marks.telugu.result = "Fail";
        }
        if (isPassed(inputstudent.marks.hindi)) {
            inputstudent.marks.hindi.result = "Pass";
        } else {
            inputstudent.marks.hindi.result = "Fail";
        }
        if (isPassed(inputstudent.marks.english)) {
            inputstudent.marks.english.result = "Pass";
        } else {
            inputstudent.marks.english.result = "Fail";
        }
        if (isPassed(inputstudent.marks.maths)) {
            inputstudent.marks.maths.result = "Pass";
        } else {
            inputstudent.marks.maths.result = "Fail";
        }
        if (isPassed(inputstudent.marks.science)) {
            inputstudent.marks.science.result = "Pass";
        } else {
            inputstudent.marks.science.result = "Fail";
        }
        if (isPassed(inputstudent.marks.social)) {
            inputstudent.marks.social.result ="Pass";
        } else {
            inputstudent.marks.social.result ="Fail";
        }
        if(inputstudent.marks.hindi.result.equals("Pass")
            && inputstudent.marks.telugu.result.equals("Pass")
            &&inputstudent.marks.english.result.equals("Pass")
            &&inputstudent.marks.maths.result.equals("Pass")
            &&inputstudent.marks.science.result.equals("Pass")
            &&inputstudent.marks.social.result.equals("Pass")
        ) {
            inputstudent.result="Pass";
        }else{
            inputstudent.result="Fail";

        }
        //if (inputstudent.marks.telugu.marks >= 35 &&
        //   inputstudent.marks.hindi.marks >= 21 &&
        // inputstudent.marks.english.marks >= 35 &&
        //inputstudent.marks.maths.marks >= 35 &&
        //inputstudent.marks.science.marks >= 35 &&
        //inputstudent.marks.social.marks >= 35) {
        // inputstudent.result = "Pass";
        // } else {
        //    inputstudent.result = "Fail";
        // }
         return inputstudent;
        }

    public StudentMarksTest() {

    }

    public static void main (String[]args){


            Subject telugu = new Subject("telugu",30);
           // telugu.name = "telugu";
            //telugu.marks = 30;

            Subject hindi = new Subject("hindi",60);
            //hindi.name = "hindi";
            //hindi.marks = 60;

            Subject english = new Subject("english",80);
            //english.name = "english";
            //english.marks = 80;

            Subject maths = new Subject("maths",85);
            //maths.name = "maths";
            //maths.marks = 85;

            Subject science = new Subject("science",20);
            //science.name = "science";
            //science.marks = 20;

            Subject social = new Subject("social",10);
            //social.name = "social";
            //social.marks = 70;

            Marks marks = new Marks(telugu,hindi,english,maths,science,social);

            marks.telugu = telugu;
            marks.hindi = hindi;
            marks.english = english;
            marks.maths = maths;
            marks.science = science;
            marks.social = social;
            Student student = new Student("Aparna","Ravindra","12345678","12/03/2002","Chaitanya");
            student.marks = marks;
            student.name = "Aparna";
            student.fatherName = "Ravindra";
            student.dateOfBirth = "12/03/2002";
            student.mobileNum = "12345678";


            StudentMarksTest test = new StudentMarksTest();
            Student lateststudent = test.getResult(student);
            System.out.println("result = " + lateststudent);


        }
    }
