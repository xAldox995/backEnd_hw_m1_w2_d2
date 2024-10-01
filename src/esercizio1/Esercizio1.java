package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insersci il numero di parole: ");
        int N = 0;

        while (true){
            try {
                N = Integer.parseInt(in.nextLine());
                if (N <= 0) System.out.println("Inserisci un numero positivo");
                else break;
            } catch (NumberFormatException ex) {
                System.out.println("Input non valido. Inserisci un numero (intero): ");
            }
        }
        Set <String> parole = new HashSet<>();
        Set <String> paroleRipetute = new HashSet<>();

        for (int i=0; i<N; i++) {
            int index = i+1;
            System.out.print("Inserisci la #"+index+": ");
            String parola = in.nextLine().trim();
            if (!parole.add(parola)){
                paroleRipetute.add(parola);
            }
        }
        in.close();

        if (!paroleRipetute.isEmpty()) {
            System.out.println("\nParole duplicate:");
            for (String parola : paroleRipetute){
                System.out.println(parola);
            }
        } else {
            System.out.println("\nNon ci sono parole dupicate.");
        }

        System.out.println("\nNumero parole inserite: "+ parole.size());
        System.out.println("Elenco parote inserite:");
        for (String parola : parole) {
            System.out.println(parola);
        }
    }
}
