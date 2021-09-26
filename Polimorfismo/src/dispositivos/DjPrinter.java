package dispositivos;
import document.PlainTextDocument;

public class DjPrinter {
    public DjPrinter(){
        //
    }

    public Boolean print(PlainTextDocument doc){
        System.out.println("clc..clc... cllllllclcl....prrrrr>>>>>>>");
        System.out.println(doc.text.toUpperCase());
        return true;
    }

}