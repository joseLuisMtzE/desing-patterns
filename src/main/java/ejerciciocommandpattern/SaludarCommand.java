package ejerciciocommandpattern;

public class SaludarCommand implements ICommand {

    Receiver command;

    public SaludarCommand(Receiver command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.saludar();
    }

}
