package printingservice;
import document.*;
import dispositivos.*;
import user.*;

public class PrintJob {
    private Printer buscarImpresoraEnElDominio(Usuario user){
        // Este método simula una búsqueda en un 'ActiveDirectory' o equivalente
        // Los usuarios de la organización están adscriptos a un 'DOMINIO' en el 
        // que configura la impresora disponible de acuerdo a su puesto de trabajo.
        if(user.nombre == "Juan"){
            return new DjPrinter();
        }
        if(user.nombre == "Sofía"){
            return new LjPrinter();
        }
        if(user.nombre == "Pedro"){
            return new LjPrinter();
        }
        return new Printer();
    }

    public Boolean print(PlainTextDocument doc, Usuario usu){
        Boolean status = false;
        // la instancia de la impresora se obtiene
        // del 'active directory'
        System.out.println("Buscando impresora para " + usu.nombre);
        Printer p = this.buscarImpresoraEnElDominio(usu);
        status = p.print(doc);

        return status;
    }
    
}
