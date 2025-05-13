
//Qui stiamo proavndo le VARIABILI

public class PrimeVariabili {
    public static void main(String[] args) {
        // Prova int, String e boolean
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo ";
        boolean provaBool = true;

        // Stampa delle variabili
        System.out.println("Valore di provaNumero: " + provaNumero);
        System.out.println("Valore di provaTesto: " + provaTesto);
        System.out.println("Valore di provaBool: " + provaBool);

        // Concatenazione di stringhe
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println("Risultato della concatenazione: " + fullPart);

        // Dichiarazione a cascata e somma
        int x = 5;
        int y = 6;
        System.out.println("Somma di x + y: " + (x + y));

        //I tipi primitivi 
        double myDouble = 19.99d; 
        
        System.out.println("Valore di myDouble: " + myDouble);
    }
}

