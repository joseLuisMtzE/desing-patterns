package ejerciciocommandpattern;

public class Invoker {

    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;

    }

    public void pressButton() {
        command.execute();
    }

}
