package ejerciciocommandpattern;

import java.util.Scanner;

public class EjercicioCommandPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int indexButton;
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
            invoker.printCommands();
            System.out.print("Numero de comando: ");
            indexButton = scanner.nextInt();

            invoker.pressButton(indexButton);
            System.out.println("-----------------------\n");

        }

    }
}
