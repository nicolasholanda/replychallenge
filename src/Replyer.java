public abstract class Replyer {

    private String company;
    private int bonusPotential;

    public Replyer(String company, int bonusPotential) {
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
