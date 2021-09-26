package dispositivos;
import document.PlainTextDocument;

public class DjPrinter extends Printer {
    public DjPrinter(){
        //
    }

    public Boolean print(PlainTextDocument doc){
        System.out.println("DJ dice: clc..clc... cllllllclcl....prrrrr>>>>>>>");
        System.out.println(doc.text.toUpperCase());
        return true;
    }

}