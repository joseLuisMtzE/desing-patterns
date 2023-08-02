package ejerciciocommandpattern;

public class Terminar implements ICommand {

    Receiver command;

    public Terminar(Receiver command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.terminar();
    }

}
