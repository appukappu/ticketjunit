package accessSpecifiers;

public class TestClass {

    public String login(MobilePassword mobilePassword) {
        String localpassword = "Aparna";
        if (mobilePassword.getPassword().equals(localpassword)) {
            return "longin successful";

        } else
            return "longin failed";
    }


    public static void main(String[] args) {
        MobilePassword mobilePassword = new MobilePassword("Appu", "aparnareddy312@gmail.com", "Aparna",1234,"Appu");
        TestClass test = new TestClass();
        System.out.println(test.login(mobilePassword));
        System.out.println(mobilePassword);
    }
}