package ejerciciocommandpattern;

public class FechaYHoraCommand implements ICommand {

    Receiver command;

    public FechaYHoraCommand(Receiver command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.mostrarFechaYHora();
    }

}
