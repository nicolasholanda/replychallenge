public class ReplyerCell {
    private String type; //D, PM
    private Replyer content;

    public ReplyerCell(String type, Replyer content){
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Replyer getContent() {
        return content;
    }

    public void setContent(Replyer content) {
        this.content = content;
    }
}
