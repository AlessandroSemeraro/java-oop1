package esercizi.javashop;


public class Main {

    public static void main(String[] args) {

        Prodotto prodotto1 = new Prodotto(1,"aspirapolvere","aspirapolvere di ultima generazione",20.00,22);

        System.out.println("Codice: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo base: " + prodotto1.getPrezzoBase());
        System.out.println("Prezzo comprensivo di IVA: Euro " + prodotto1.getPrezzoCompleto());
        System.out.println("Nome per esteso: " + prodotto1.getNomeEsteso());
    }
}
