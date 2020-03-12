import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    private static final String INPUT_PATH = "C:\\Users\\nikol\\Documents\\Projetos\\replychallenge\\input.txt";

    private static String readInputFileAsString(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static Room stringToRoom() {
        String input = readInputFileAsString(INPUT_PATH);

        String[] lines = input.split("\r\n");

        int width = Integer.parseInt(lines[0].split(" ")[0]);
        int height = Integer.parseInt(lines[0].split(" ")[1]);

        Room room = new Room(width, height);

        for(int row = 1; row <= height; row++) {
            String currentLine = lines[row];
            for(int col = 0; col < width; col++) {
                String cell = currentLine.substring(col, col+1);
                if(cell.equals("#")) room.addCell(row-1, col, null);
                else if(cell.equals("_")) room.addCell(row-1, col, new ReplyerCell("D"));
                else if(cell.equals("M")) room.addCell(row-1, col, new ReplyerCell("PM"));
            }
        }

        return room;
    }

}
