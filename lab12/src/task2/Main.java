package task2;

public class Main {
    public static void main(final String[] args) {
        LoggerBase logger1 = new ConsoleLogger();
        LoggerBase logger2 = new EmailLogger();
        LoggerBase logger3 = new FileLogger();

        logger1.setNext(logger2);
        logger2.setNext(logger3);

        logger1.message("Se execută metoda ProcessOrder()", LogLevel.Debug);
        logger1.message("Comanda a fost procesată cu succes", LogLevel.Info);
        logger1.message("Datele despre adresa clientului lipsesc din baza de date a filialei", LogLevel.Warning);
        logger1.message("Detele despre adresa clientului lipsesc din baza de date a organizație", LogLevel.Error);
        logger1.message("Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1",
                LogLevel.FunctionalError);
        logger1.message("Comandă procesată", LogLevel.FunctionalMessage);
    }
}