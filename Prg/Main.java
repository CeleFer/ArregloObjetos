import datos.*;
import logica.*;


public class Main{

    public static void main(String[] args) {

        Logica log = new Logica();

        Trabajadores[] tra = log.init(); 


        log.menu(tra);
        
        /*
        log.ingreso(tra);
        log.ingreso(tra);

        LE.mostrarInformacion(tra[0].getNombre());
        LE.mostrarInformacion(tra[1].getNombre());
        */
    }
}