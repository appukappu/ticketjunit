package hospital;

public class CompanyDetails {
    String projectname;
    String companyname;

    @Override
    public String toString() {
        return "  CompanyDetails{" +
                "projectname='" + projectname + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }

    public CompanyDetails(){
        projectname = "Hospial Management";
        companyname = "Neoteric";
    }

}
