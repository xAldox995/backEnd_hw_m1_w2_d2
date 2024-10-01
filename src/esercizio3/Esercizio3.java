package esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rubrica rubrica = new Rubrica();

        while (true) {
            System.out.println("\n--- Rubrica Telefonica ---");
            System.out.println("1. Inserisci un contatto");
            System.out.println("2. Cancella un contatto");
            System.out.println("3. Ricerca una persona per numero di telefono");
            System.out.println("4. Ricerca il numero di telefono per una persona");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione (1-6): ");

            String userInput = in.nextLine().trim();
            int scelta;

            try {
                scelta = Integer.parseInt(userInput);
            } catch (NumberFormatException ex) {
                System.out.println("Input non valido. Inserisci un numero tra 1-6");
                continue;
            }

            if (scelta < 1 || scelta > 6) {
                System.out.println("Opzione non valida, scegli tra 1-6");
                continue;
            }

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci nome contatto: ");
                    String nomeContatto = in.nextLine().trim();
                    if (nomeContatto.isEmpty()) {
                        System.out.println("Il nome non può essere vuoto");
                        break;
                    }
                    System.out.println("Inserisci numero contatto:");
                    String numeroContatto = in.nextLine().trim();
                    if (numeroContatto.isEmpty()) {
                        System.out.println("Il numero non può essere vuoto");
                        break;
                    }
                    rubrica.aggiungiContatto(nomeContatto, numeroContatto);
                    break;

                case 2:
                    System.out.print("Inisersci il nome del contatto da eliminare: ");
                    String nomeDaCancellare = in.nextLine().trim();
                    if (nomeDaCancellare.isEmpty()) {
                        System.out.println("Inserisci un nome per indicare il contatto  da cancellare");
                        break;
                    }
                    rubrica.cancellaContatto(nomeDaCancellare);
                    break;

                case 3:
                    System.out.print("Inserisci il numero di telefono per la ricerca: ");
                    String numSearch = in.nextLine().trim();
                    if (numSearch.isEmpty()){
                        System.out.println("Non posso cercare il contatto se non inserisci il numero");
                        break;
                    }
                    rubrica.cercaContattoTelefono(numSearch);
                    break;

                case 4:
                    System.out.print("Inserisci il nome del contatto per la ricerca: ");
                    String nomeSearch = in.nextLine().trim();
                    if (nomeSearch.isEmpty()){
                        System.out.println("Non posso cercare il contatto se non nome");
                        break;
                    }
                    rubrica.cercaContattoNome(nomeSearch);
                    break;

                case 5:
                    rubrica.stampaContattiRubbrica();
                    break;

                case 6:
                    System.out.println("Grazie per aver consultato la tua rubrica personale");
                    in.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opzione non valida.");
            }


        }
    }
}
