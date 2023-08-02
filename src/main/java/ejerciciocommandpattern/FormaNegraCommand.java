package ejerciciocommandpattern;

public class FormaNegraCommand implements ICommand {

    Receiver command;

    public FormaNegraCommand(Receiver command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.cambiarFormaANegro();
    }

}
