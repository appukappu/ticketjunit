package hospital;

public class ProjectTest {
    public static void main(String[] args) {
       CompanyDetails end = new CompanyDetails();
       end.companyname="TCS";
       end.companylocation="Hyd";

       ProjectDetails hospital = new ProjectDetails("Hospital Managment","FrontEnd",end);
        System.out.println(" front End : "+hospital);
        ProjectDetails hospital1 = new ProjectDetails("Hospital Managment","BackEnd");
        System.out.println("Back End : "+hospital1);}
}
