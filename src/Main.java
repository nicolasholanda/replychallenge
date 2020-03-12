import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String args[]) throws IOException, URISyntaxException {
        System.out.println("running...");
        writeResponseFile("teste");
    }



    private static void writeResponseFile(Object outputData) throws IOException, URISyntaxException {
        String url = Object.class.getResource("/output.txt").getFile();
        FileWriter arq = new FileWriter(url);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(outputData.toString());

    }

}
