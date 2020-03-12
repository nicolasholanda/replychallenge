import java.util.ArrayList;

public class Developer extends Replyer{
    public ArrayList<String> skills;

    public Developer(String company, int bonusPotential, ArrayList<String> skills) {
        super(company, bonusPotential);
        this.setCompany(company);
        this.setBonusPotential(bonusPotential);
        this.skills = skills;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}