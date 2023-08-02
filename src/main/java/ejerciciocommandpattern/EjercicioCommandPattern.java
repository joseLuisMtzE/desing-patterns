package ejerciciocommandpattern;

public class EjercicioCommandPattern {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Invoker invoker = new Invoker();

        SaludarCommand saludar = new SaludarCommand(receiver);
        FechaYHoraCommand fechaYHora = new FechaYHoraCommand(receiver);
        FormaRojaCommand formaRoja = new FormaRojaCommand(receiver);
        FormaNegraCommand formaNegra = new FormaNegraCommand(receiver);
        Terminar terminar = new Terminar(receiver);

        invoker.setCommand(saludar);
        invoker.pressButton();

        invoker.setCommand(fechaYHora);
        invoker.pressButton();
        invoker.setCommand(formaRoja);
        invoker.pressButton();
        invoker.setCommand(formaNegra);
        invoker.pressButton();
        invoker.setCommand(terminar);
        invoker.pressButton();

    }
}
