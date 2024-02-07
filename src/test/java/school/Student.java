package school;

public class Student {

    public String name;
    public String fatherName;
    public String mobileNum;
    public String dateOfBirth;
    public String schoolName;

    public Address address;

    public Marks marks;

    public Student(String name, String fatherName, String mobileNum, String dateOfBirth, String schoolName) {
        this.name = name;
        this.fatherName = fatherName;
        this.mobileNum = mobileNum;
        this.dateOfBirth = dateOfBirth;
        this.schoolName = schoolName;
       // this.address = address;
       // this.marks = marks;
        //this.getDateOfBirth = getDateOfBirth;
        //this.getSchoolName = getSchoolName;
        //this.result = result;
    }

    public String getDateOfBirth;
    String getSchoolName;

    public  String result;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", address=" + address +
                ", marks=" + marks +
                ", getDateOfBirth='" + getDateOfBirth + '\'' +
                ", getSchoolName='" + getSchoolName + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}