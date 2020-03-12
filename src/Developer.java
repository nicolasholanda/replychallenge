import java.util.ArrayList;

public class Developer{
    public String company;
    public int bonusPotential;
    public ArrayList<String> skills;

    public Developer(String company, int bonusPotential, ArrayList<String> skills) {
        this.company = company;
        this.bonusPotential = bonusPotential;
        this.skills = skills;
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

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}