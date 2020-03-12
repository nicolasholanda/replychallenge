import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String args[]) throws IOException {
        System.out.println("running...");
        writeResponseFile("teste");
    }



    private static void writeResponseFile(Object outputData) throws IOException {
        String url = Object.class.getResource("/").getFile();
        FileWriter arq = new FileWriter(url+"output.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(outputData.toString());
        arq.close();
    }



}
