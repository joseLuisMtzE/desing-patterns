package ejerciciocommandpattern;

import java.util.List;
import java.util.Scanner;

public class EjercicioCommandPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        String key;
        Receiver receiver = new Receiver();

        Invoker invoker = new Invoker();

        SaludarCommand saludar = new SaludarCommand(receiver);
        FechaYHoraCommand fechaYHora = new FechaYHoraCommand(receiver);
        FormaRojaCommand formaRoja = new FormaRojaCommand(receiver);
        FormaNegraCommand formaNegra = new FormaNegraCommand(receiver);
        Terminar terminar = new Terminar(receiver);

        invoker.addCommand(saludar);
        invoker.addCommand(fechaYHora);
        invoker.addCommand(formaRoja);
        invoker.addCommand(formaNegra);
        invoker.addCommand(terminar);

        while (continuar) {
            imprimirCommandos(invoker);
            System.out.print("Elija un comando: ");
            key = scanner.next();

            invoker.pressButton(key.toLowerCase());
            System.out.println("-----------------------\n");
        }
    }

    public static void imprimirCommandos(Invoker invoker) {
        System.out.println("Elige algun comando de la lista:");
        List<String> commandsNameList = invoker.getCommandsName();
        String commandNameItem;

        for (int i = 0; i < commandsNameList.size(); i++) {
            commandNameItem = commandsNameList.get(i);
            System.out.println("- " + commandNameItem.substring(0, 1).toUpperCase() + commandNameItem.substring(1));
        }
    }
}
//    public void printCommands() { // remover responsabilidad de imprimir lista, simplemente retornar lista
//        List<> commands = invoker.
////        for (int i = 0; i < invoker.getCommands().size(); i++) {
////            System.out.println(i + ". " + invoker.getCommands().get(i).getClass().getSimpleName()); // agregar nombre a los atributos de las clases concretas
////        }
//    }
