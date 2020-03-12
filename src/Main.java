import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        System.out.println("running...");
    }


    public static int calculateDeveloppersWP(Developer dev1, Developer dev2){

        ArrayList<String> commonSkills = new ArrayList<String>(dev1.skills);
        commonSkills.retainAll(dev2.skills);

        ArrayList<String> distinctSkills1 = new ArrayList<String>(dev1.skills);
        distinctSkills1.removeAll(dev2.skills);

        ArrayList<String> distinctSkills2 = new ArrayList<String>(dev2.skills);
        distinctSkills2.removeAll(dev1.skills);

        ArrayList<String> distinctTotal = distinctSkills1;
        distinctTotal.addAll(distinctSkills2);

        return commonSkills.size() * distinctTotal.size();
    }
}

