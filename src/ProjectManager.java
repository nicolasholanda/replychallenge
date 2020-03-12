public class ProjectManager{
    private String company;
    private int bonusPotential;

    public ProjectManager(String company, int bonusPotential) {
        this.company = company;
        this.bonusPotential = bonusPotential;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBonusPotential() {
        return bonusPotential;
    }

    public void setBonusPotential(int bonusPotential) {
        this.bonusPotential = bonusPotential;
    }
}