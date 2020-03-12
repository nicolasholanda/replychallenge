import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String args[]) throws IOException {
        System.out.println("running...");
    }



    private static void writeResponseFile() throws IOException {
        Room room = returnMockRoom();
        String outPut = convertRoomToString(room);
        String url = Object.class.getResource("/").getFile();
        FileWriter arq = new FileWriter(url+"output.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(outPut);
        arq.close();
    }

    private static String convertRoomToString(Room room){
        StringBuilder outPut = new StringBuilder();
        HashMap<String, ReplyerCell> stringReplyerCellHashMap = room.getCells();
        for (int i =0; i<room.getWidth(); i++) {
            for (int j=0; j<room.getHeight();j++){
                if(stringReplyerCellHashMap.get(i+","+j).getType() == null){
                    outPut.append("1\n");
                }else if(stringReplyerCellHashMap.get(i+","+j).getType().equals("D")){
                    outPut.append("2\n");
                }else if(stringReplyerCellHashMap.get(i+","+j).getType().equals("PM")){
                    outPut.append("3\n");
                }
            }
        }
        return outPut.toString();
    }

    private static Room returnMockRoom(){
        int width = 5;
        int height =3;


        Room room = new Room(width, height);
        room.addCell(0, 0, new ReplyerCell(null));
        room.addCell(0, 1, new ReplyerCell(null));
        room.addCell(0, 2, new ReplyerCell(null));
        room.addCell(0, 3, new ReplyerCell(null));
        room.addCell(0, 4, new ReplyerCell(null));

        room.addCell(1, 0, new ReplyerCell(null));
        room.addCell(1, 1, new ReplyerCell("D"));
        room.addCell(1, 2, new ReplyerCell(null));
        room.addCell(1, 3, new ReplyerCell(null));
        room.addCell(1, 4, new ReplyerCell(null));

        room.addCell(2, 0, new ReplyerCell(null));
        room.addCell(2, 1, new ReplyerCell("PM"));
        room.addCell(2, 2, new ReplyerCell("PM"));
        room.addCell(2, 3, new ReplyerCell("D"));
        room.addCell(2, 4, new ReplyerCell("D"));



        return room;
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

