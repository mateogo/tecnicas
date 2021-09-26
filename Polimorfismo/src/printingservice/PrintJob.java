package printingservice;
import document.*;
import dispositivos.*;
import user.*;

public class PrintJob {
    private Printer buscarImpresoraDeUsuario(String nombre){
        if(nombre == "Juan"){
            return new DjPrinter();
        }

        if(nombre == "Sofía"){
            return new LjPrinter();
        }

        if(nombre == "Pedro"){
            return new LjPrinter();
        }
        return new Printer();

    }

    public Boolean print(PlainTextDocument doc, Usuario usu){
        Boolean status = false;
        Printer p = this.buscarImpresoraDeUsuario(usu.nombre);
        status = p.print(doc);

        return status;
    }
    
}
