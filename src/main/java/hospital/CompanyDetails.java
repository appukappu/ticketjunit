package hospital;

public class CompanyDetails {
    String companylocation;
    String companyname;

    @Override
    public String toString() {
        return "  CompanyDetails{" +
                "companylocation='" + companylocation + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }

    public CompanyDetails(){
    companylocation = "Hyd";
        companyname = "Neoteric";
    }

}
