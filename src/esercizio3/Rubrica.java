package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rubrica {
    private Map<String, Contatto> contatti;

    public Rubrica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String numTelefono) {
        if (contatti.containsKey(nome)) {
            System.out.println("Il contatto \"" + nome + "\"esiste già. Aggiorno il numero di telefono.");
        } else {
            System.out.println("Inserisci il nuovo contatto \"" + nome + "\".");
        }
        contatti.put(nome, new Contatto(nome, numTelefono));
    }

    public void cancellaContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto \"" + nome + "\"cancellato con successo");
        } else System.out.println("Contatto\"" + nome + "\"non presente in rubrica");
    }

    public void cercaContattoTelefono(String numTelefono) {
        boolean trovato = false;
        Set<Map.Entry<String, Contatto>> entrySet = contatti.entrySet();

        System.out.println("Ricerca del contatto col numero: " + numTelefono);
        for (Map.Entry<String, Contatto> entry : entrySet) {
            if (entry.getValue().getNumber().equals(numTelefono)) {
                System.out.println("Risutato della ricerca: " + entry.getValue().getFullName());
                trovato = true;
            }
        }

        if (!trovato) System.out.println("Nessun risultato della ricerca con numero \"" + numTelefono + "\".");
    }

    public void cercaContattoNome(String nome) {
        if (contatti.containsKey(nome))
            System.out.println("Il numero di numero di \"" + nome + "\" è: " + contatti.get(nome).getNumber());
        else System.out.println("Contatto \"" + nome + "\"non esiste in rubrica.");
    }

    public void stampaContattiRubbrica() {
        if (contatti.isEmpty()) System.out.println("La rubrica è vuota");

        System.out.println("Elenco dei Contatti:");
        for (Contatto contatto : contatti.values()) System.out.println(contatto);
    }
}
