package ejerciciocommandpattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<ICommand> commands = new ArrayList<>();
    List<String> commandsName;

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public List<String> getCommandsName() {
        commandsName = new ArrayList<>();
        for (int i = 0; i < commands.size(); i++) {
            commandsName.add(commands.get(i).getNombre());
        }

        return commandsName;
    }

    public void pressButton(String key) {
        if (checkCommandExists(key)) {
            for (int i = 0; i < commands.size(); i++) {
                if (commands.get(i).getNombre().equals(key)) {
                    ICommand command = commands.get(i);
                    command.execute();
                }
            }
        } else {
            CommandException err = new CommandException("El comando '" + key + "' no esta soportado.");
            err.printStackTrace();
        }
    }

    public boolean checkCommandExists(String key) {
        if (getCommandsName().contains(key)) {
            return true;
        } else {
            return false;
        }
    }

}
