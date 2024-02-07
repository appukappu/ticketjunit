package school;

public class Subject {
    public String name ;
    public  int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
       // this.result = result;
    }

    public String result;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
