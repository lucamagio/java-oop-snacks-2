public class Auto{
    /*
     * Crea una classe Auto con:
    Un numero di telaio (final int numeroTelaio)
    univoco assegnato automaticamente alla creazione.
    Una variabile static int contatoreAuto per tenere traccia
    del numero totale di auto create.
    Un modello (final String modello) assegnato al momento della creazione e non modificabile.
    Ogni volta che viene creata una nuova Auto,
    il contatore deve aumentare e il numero di telaio deve essere assegnato
    in modo incrementale.
    Implementa un metodo static int getNumeroTotaleAuto()
    che restituisca il numero totale di auto create.
    Scrivi un programma che:
    Crei alcune auto e stampi il loro numero di telaio e modello.
    Stampi il numero totale di auto create.
     */

    private static int contatoreAuto = 0;
    private final int numeroTelaio;
    private final String modello;
 
    public Auto(String modello) {
        this.contatoreAuto = contatoreAuto + 1;
        this.numeroTelaio = 1000 + contatoreAuto;
        this.modello = modello;
    }
 
    public int getNumeroTelaio() {
        return numeroTelaio;
    }
 
    public String getModello() {
        return modello;
    }
 
    public static int getNumeroTotaleAuto() {
        return contatoreAuto;
    }

    @Override
    public String toString() {
        return "Il modello dell'auto è: " + modello + ", il suo telaio è: " + numeroTelaio;
    }

    
}