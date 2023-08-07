package ejerciciocommandpattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<ICommand> commands = new ArrayList<>();
    List<String> commandsName = new ArrayList<>();

    public void addCommand(ICommand command) {
        commands.add(command);
        commandsName.add(command.getNombre());
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
        if (commandsName.contains(key)) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getCommandsName() {
        return commandsName;
    }

}
