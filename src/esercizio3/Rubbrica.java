package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rubbrica {
    private Map<String, Contatto> contatti;

    public Rubbrica() {
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
        } else System.out.println("Contatto\"" + nome + "\"non presente in rubbrica");
    }

    public void cercaContattoTelefono (String numTelefono){
        boolean trovato = false;
        Set<Map.Entry<String,Contatto>> entrySet = contatti.entrySet();
    }
}
