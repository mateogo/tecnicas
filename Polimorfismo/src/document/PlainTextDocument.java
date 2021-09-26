package document;

public class PlainTextDocument {
    public String text = "Soy un documento de texto";

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
