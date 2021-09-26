package dispositivos;
import document.PlainTextDocument;

public class LjPrinter extends Printer{
    public Boolean print(PlainTextDocument doc){
        System.out.println("LJ dice: fs..fs... tr.... tr....trrrrrrr>>>>>>>");
        System.out.println(doc.text);
        return true;
    }
    
}
