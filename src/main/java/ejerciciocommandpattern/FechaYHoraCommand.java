package ejerciciocommandpattern;

public class FechaYHoraCommand implements ICommand {

    Receiver command;
    String nombre;

    public FechaYHoraCommand(Receiver command) {
        this.command = command;
        this.nombre = "fecha";

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void execute() {
        command.mostrarFechaYHora();
    }

}
