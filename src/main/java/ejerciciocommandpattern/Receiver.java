package ejerciciocommandpattern;

import java.util.Date;

public class Receiver {

    public void saludar() {
        System.out.println("Hola!");
    }

    public void mostrarFechaYHora() {
        Date fecha = new Date();
        System.out.println(fecha);
    }

    public void cambiarFormaARojo() {
        System.out.println("Cambiando color de forma a rojo");
    }

    public void cambiarFormaANegro() {
        System.out.println("Cambiando color de forma a negro");
    }

    public void terminar() {
        System.out.println("Cerrando la aplicacion... Hasta luego!");
        System.exit(0);
    }

}
