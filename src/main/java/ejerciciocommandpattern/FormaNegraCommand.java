package ejerciciocommandpattern;

public class FormaNegraCommand implements ICommand {

    Receiver command;
    String nombre;

    public FormaNegraCommand(Receiver command) {
        this.command = command;
        this.nombre = "negro";

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void execute() {
        command.cambiarFormaANegro();
    }

}
