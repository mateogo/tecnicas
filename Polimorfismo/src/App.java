import document.*;
import printingservice.PrintJob;
import user.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========================================================");
        System.out.println("Variante 3: Invocando al servicio de impresión");
        System.out.println("Mejora de diseño: Se selecciona la impresora del usuario");
        System.out.println("==========================================================");

        PlainTextDocument doc = new PlainTextDocument();
        doc.setText("Hola Mundo, soy un documento de texto plano");

        Usuario u = new Usuario("Marité");
        
        PrintJob pr = new PrintJob();
        Boolean status = pr.print(doc, u);
        System.out.println("FIN: Impresión retornó " + status);

    }
}
