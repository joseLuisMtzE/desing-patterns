package ejerciciocommandpattern;

public class SaludarCommand implements ICommand {

    Receiver command;
    String nombre;

    public SaludarCommand(Receiver command) {
        this.command = command;
        this.nombre = "saludar";
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void execute() {
        command.saludar();
    }

}
