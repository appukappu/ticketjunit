package constructeroverloading;

public class Student {
    public String name;
    public String fatherName;
    public String dob;
    public String moblieNo;
    public Address address;

    public Student(String name,String fatherName,String dob,String moblieNo,Address address){
        this.name=name;
        this.fatherName=fatherName;
        this.dob=dob;
        this.moblieNo=moblieNo;
        this.address=address;
    }

    public Student(String name,String fatherName,String dob,String moblieNo){
        this(name,fatherName,dob,moblieNo,new Address());
    }
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", moblieNo='" + moblieNo + '\'' +
                ", address=" + address +
                '}';
    }
}
