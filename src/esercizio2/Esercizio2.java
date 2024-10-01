package esercizio2;

import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qunati numeri voui stampare? ");
        int N = 0;
        while (true) {
            try {
                N = Integer.parseInt(in.nextLine());
                if (N <= 0) System.out.print("Inserisci un numero positivo: ");
                else break;
            } catch (NumberFormatException ex) {
                System.out.print("Input non valido. Riprova: ");
            }
        }
        List<Integer> numberList = generaLista(N);
        System.out.println("Lista in ordine crescente di " + N + " numeri casuali:");
        System.out.println(numberList);

        List<Integer> numberListInversa = listaInversa(numberList);
        System.out.println("\nListe in ordine invereso: ");
        System.out.println(numberListInversa);

        System.out.println("Vuoi stampare i numeri con indice pari? (true/false): ");
        boolean stampaPariDispari = false;
        while (true) {
            String input = in.nextLine().trim().toLowerCase();
            if (input.equals("true")) {
                stampaPariDispari = true;
                break;
            } else if (input.equals("false")) {
                stampaPariDispari = false;
                break;
            } else {
                System.out.println("Input non valido. Devi inserire true o false");
            }
        }
        stampaPosizioni(numberListInversa, stampaPariDispari);
        in.close();
    }

    public static List<Integer> generaLista(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int numeroRandomico = random.nextInt(101);
            lista.add(numeroRandomico);
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> listaInversa(List<Integer> originalList) {
        List<Integer> listaInversa = new ArrayList<>(originalList);
        Collections.reverse(listaInversa);
        return listaInversa;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        if (pari) {
            System.out.println("Elementi con indice pari:");
        } else {
            System.out.println("Elementi con indice dispari:");
        }

        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            }
        }
    }
}
