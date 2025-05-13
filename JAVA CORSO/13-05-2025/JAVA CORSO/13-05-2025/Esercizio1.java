    //ESERCIZIO 1
    import java.util.Scanner; // Import the Scanner class

    public class Esercizio1 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea un oggetto Scanner per leggere i dati

        // Chiedi all'utente di inserire un numero intero e lo legge
        System.out.print("Inserisci un intero: ");
        int intero = scanner.nextInt();

        // Chiedi a un numero decimale e lo legge
        System.out.print("Inserisci un decimale: ");
        double decimale = scanner.nextDouble();

        scanner.nextLine(); //Pulisce il buffer

        // Chiedi una stringa e la legge
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        // Chiedi un valore booleano (true/false) e lo legge
        System.out.print("Inserisci un booleano (true/false): ");
        boolean bool = scanner.nextBoolean();

        //Stampa tutti i valori inseriti e specifica il tipo di ciascuno
        System.out.println("\nValori inseriti e tipi:");
        System.out.println("Intero: " + intero + " (int)");
        System.out.println("Decimale: " + decimale + " (double)");
        System.out.println("Stringa: " + stringa + " (String)");
        System.out.println("Booleano: " + bool + " (boolean)");

        scanner.close();
    }
}
    