package ejerciciocommandpattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<ICommand> commands = new ArrayList<>();

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void pressButton(int index) {
        if (index >= 0 && index < commands.size()) {
            ICommand command = commands.get(index);
            command.execute();
        } else {
            System.out.println("Invalid command index.");
        }
    }

    public void printCommands() {
        for (int i = 0; i < commands.size(); i++) {
            System.out.println(i + ". " + commands.get(i).getClass().getSimpleName());
        }
    }

}
