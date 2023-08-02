package ejerciciocommandpattern;
public class FormaRojaCommand implements ICommand {

    Receiver command;

    public FormaRojaCommand(Receiver command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.cambiarFormaARojo();
    }

}