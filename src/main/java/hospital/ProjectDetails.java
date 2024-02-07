package hospital;

public class ProjectDetails {
    String projectname;
    String sofware;
    CompanyDetails backEnd;

    public ProjectDetails(String projectname, String sofware, CompanyDetails backEnd) {
        this.projectname = projectname;
        this.sofware = sofware;
        this.backEnd = backEnd;
    }

    public ProjectDetails(String projectname, String sofware) {
        this(projectname,sofware,new CompanyDetails());

    }
public ProjectDetails(){

}

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "projectname='" + projectname + '\'' +
                ", sofware='" + sofware + '\'' +
                  backEnd +
                '}';
    }
}
