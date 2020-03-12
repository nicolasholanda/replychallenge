import java.util.ArrayList;

public class solver {

    public class Developer{
        public String company;
        public int bonusPotential;
        public ArrayList<String> skills;

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
}

