package constructeroverloading;

public class ConstructTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.city="KPHB";
        address.pincode="12345";
        address.state="TS";
        address.country="India";
        Student student = new Student("Aparna", "Ravindra","12/03/2002","12345678",address);
        System.out.println("Joining Student " + student);
        Student examStudent= new Student("Aparna", "Ravindra","12/03/2002","12345678");
        System.out.println("examStudent "+examStudent);

    }

}
