import java.util.HashMap;

public class Room {
    private int width;
    private int height;
    private HashMap<String, ReplyerCell> cells;
    private int workPotential;

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new HashMap<>();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public HashMap<String, ReplyerCell> getCells() {
        return cells;
    }

    public void addCell(int row, int column, ReplyerCell content){
        this.cells.put(row + "," + column, content);
    }

    public int getWorkPotential() {
        return workPotential;
    }

    public void setWorkPotential(int workPotential) {
        this.workPotential = workPotential;
    }
}
