package esercizi.javashop;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private Double prezzo;
    private int iva;

    //COSTRUTTORE
    public Prodotto(int codice,String nome, String descrizione, Double prezzo, int iva){
        Random random = new Random();
        this.codice = random.nextInt(1, 9999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = (iva > 0) ? iva : 22;
    }

    //GETTER E SETTER
    public String getCodice() {
        return String.format("%06d", codice);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        if (!descrizione.isEmpty()) {
            this.descrizione = descrizione;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        }
    }

    public double getIva() {
        return iva;
    }

    public double getPrezzoBase() {
        return prezzo;
    }

    public double getPrezzoCompleto() {
        double vatPrice = ((prezzo * iva) / 100) + prezzo;
        return Math.round(vatPrice * 100.0) / 100.0;
    }

    public String getNomeEsteso() {
        return String.format("%s - %s", codice, nome);
    }

}