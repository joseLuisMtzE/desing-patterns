package ejerciciocommandpattern;

public class Terminar implements ICommand {

    Receiver command;
    String nombre;

    public Terminar(Receiver command) {
        this.command = command;
        this.nombre = "terminar";

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void execute() {
        command.terminar();
    }

}
