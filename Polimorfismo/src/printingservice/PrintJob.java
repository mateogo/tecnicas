package printingservice;
import document.*;
import dispositivos.*;

public class PrintJob {
    public Boolean print(PlainTextDocument doc){
        //LjPrinter p = new LjPrinter();
        DjPrinter p = new DjPrinter();

        Boolean status = p.print(doc);

        return status;
    }
    
}
