package school;

public class StudentTest {
    public Student getStudentAddress(Student stu) {
        stu.schoolName = "Chaitanya";
        Student aparnaStudent = new Student("Aparna","Ravindra","12345678","12/03/2002","Chaitanya");
        StudentTest studentTest = new StudentTest();
        //studentTest.getStudentDeepClone(aparnaStudent);
        //System.out.println("aparnaStudent school hashcode= " + aparnaStudent.hashCode());
        aparnaStudent.name = "Aparna";
        aparnaStudent.fatherName = "Ravindra";
        aparnaStudent.mobileNum = "12345678";
        aparnaStudent.dateOfBirth = "12/03/2002";
        aparnaStudent.schoolName = "Chaitanya";
        Address schoolAddress = new Address();

        schoolAddress.city = "Vijayawada";
        aparnaStudent.address = schoolAddress;
        //aparnaStudent.address.city = "Vijayawada";
       // Student student = studentTest.getStudentAddress(aparnaStudent);
       // System.out.println("schoolName = " + student.schoolName);
        //System.out.println("schoolAddress= " + student.address.city.hashCode());


        return aparnaStudent;
    }

       Student getStudentDeepClone(Student xyz) {
           Student clonedStudent = new Student("Aparna","Ravindra","12345678","12/03/2002","Chaitanya");
           clonedStudent.name="Aparna";
           clonedStudent.mobileNum="12345678";
           clonedStudent.schoolName = "sri";
         System.out.println("getStudentDeepClone =" + clonedStudent.schoolName.hashCode ());
         return clonedStudent;

       }
   static String getRollNum(Student abc){
      System.out.println("getrollnum hashcode = " + abc.hashCode());
     return "";
    }


    public static void main(String[] args) {


        Student aparnaStudent1 = new Student("Aparna","Ravindra","12345678","12/03/2002","Chaitanya");
        System.out.println("schoolName = "+ aparnaStudent1.schoolName);

        Student chanduStudent = new Student("Aparna","Ravindra","12345678","12/03/2002","Chaitanya");
        chanduStudent.name="Chandu";
        chanduStudent.fatherName="Narasimha";
        chanduStudent.mobileNum="87654321";
        chanduStudent.dateOfBirth="18/04/2001";
        chanduStudent.schoolName="Chaitanya";
        System.out.println("schoolName = "+ chanduStudent.schoolName);

        StudentTest studentTest = new StudentTest();
        studentTest.getStudentDeepClone(chanduStudent);
        System.out.println("aparnaStudent school hashcode= " + chanduStudent.hashCode());
        studentTest.getStudentAddress(aparnaStudent1);
        // System.out.println("schoolAddress= " + aparnaStudent1.address.city);
        Student studentadd = studentTest.getStudentAddress(aparnaStudent1);
        System.out.println(studentadd+"Address");


        StudentTest.getRollNum(aparnaStudent1);
         System.out.println("aparnaStudent = " + aparnaStudent1.hashCode() );
        StudentTest.getRollNum(chanduStudent);
        System.out.println("chanduStudent gopi = " + chanduStudent.hashCode());
        //System.out.println(studentTest.getStudent(aparnaStudent1).address.city);



    }
}
