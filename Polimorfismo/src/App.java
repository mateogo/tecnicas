import document.*;
import printingservice.PrintJob;
import user.*;

public class App {
    static private Usuario usuarioLogueado(){
        return  new Usuario("Pedro");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("=========================================================");
        System.out.println("Variante 3: Invocando al servicio de impresión");
        System.out.println("Mejora de diseño: Se selecciona la impresora del usuario");
        System.out.println("==========================================================");

        PlainTextDocument doc = new PlainTextDocument();
        doc.setText("Hola Mundo, la impresora efectiva depende del usuario");

        // suponemos que este es el usuario logueado
        Usuario u = App.usuarioLogueado();
        
        PrintJob pr = new PrintJob();
        Boolean status = pr.print(doc, u);
        System.out.println("FIN: Impresión retornó " + status);

    }
}
