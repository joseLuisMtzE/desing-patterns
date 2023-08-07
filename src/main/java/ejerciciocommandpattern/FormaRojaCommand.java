package ejerciciocommandpattern;

public class FormaRojaCommand implements ICommand {

    Receiver command;
    String nombre;

    public FormaRojaCommand(Receiver command) {
        this.command = command;
        this.nombre = "rojo";

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void execute() {
        command.cambiarFormaARojo();
    }

}
