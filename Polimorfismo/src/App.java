import document.*;
import printingservice.PrintJob;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========================================");
        System.out.println("Invocando al servicio de impresión");
        System.out.println("========================================");

        PlainTextDocument doc = new PlainTextDocument();
        doc.setText("Hola Mundo, soy un documento de texto plano");
        PrintJob pr = new PrintJob();
        
        Boolean status = pr.print(doc);
        System.out.println("FIN: Impresión retornó " + status);

    }
}
