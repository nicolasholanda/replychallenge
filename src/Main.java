import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        System.out.println("running...");
        Developer dev1 = new Developer("comp", 2, new ArrayList<>() {
            {
                add("python");
                add("c");
                add("java");
            }
        });
        Developer dev2 = new Developer("comp2", 2, new ArrayList<>() {
            {
                add("c++");
                add("c");
                add("java");
            }
        });

        System.out.println(calculateDeveloppersWP(dev1, dev2));;

    }




    public static int calculateDeveloppersWP(Developer dev1, Developer dev2){

        ArrayList<String> commonSkills = new ArrayList<String>(dev1.skills);
        commonSkills.retainAll(dev2.skills);

        ArrayList<String> distinctSkills = new ArrayList<String>(dev1.skills);
        distinctSkills.removeAll(dev2.skills);

        return commonSkills.size() * distinctSkills.size();
    }
}

