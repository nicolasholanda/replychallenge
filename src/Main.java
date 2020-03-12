import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        System.out.println("running...");
    }



    private static void writeResponseFile(Object outputData) throws IOException {
        String url = Object.class.getResource("/").getFile();
        FileWriter arq = new FileWriter(url+"output.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(outputData.toString());
        arq.close();
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

