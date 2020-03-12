import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        System.out.println("running...");
    }


    public static int calculateWP(ReplyerCell rep1, ReplyerCell rep2){
        Developer dev1 = (Developer) rep1.getContent();
        Developer dev2 = (Developer) rep2.getContent();

        ArrayList<String> commonSkills = new ArrayList<>(dev1.getSkills());
        commonSkills.retainAll(dev2.getSkills());

        ArrayList<String> distinctSkills1 = new ArrayList<>(dev1.getSkills());
        distinctSkills1.removeAll(dev2.getSkills());

        ArrayList<String> distinctSkills2 = new ArrayList<>(dev2.getSkills());
        distinctSkills2.removeAll(dev1.getSkills());

        ArrayList<String> distinctTotal = distinctSkills1;
        distinctTotal.addAll(distinctSkills2);

        return commonSkills.size() * distinctTotal.size();
    }

    public static int calculateBP(ReplyerCell rep1, ReplyerCell rep2){
        Developer dev1 = (Developer) rep1.getContent();
        Developer dev2 = (Developer) rep2.getContent();

        boolean b = dev1.getCompany().equals(dev2.getCompany());

        return  b ? dev1.getBonusPotential() * dev2.getBonusPotential() : 0;
    }
}

