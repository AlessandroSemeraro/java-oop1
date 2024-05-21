package esercizi.javabank;

import java.util.Random;

public class Conto {


    //ATTRIBUTI
    private int numeroConto;
    private String proprietario;
    private double saldo;

    //COSTRUTTORE
    public Conto(String proprietario ) {
        Random random = new Random();
        this.numeroConto = random.nextInt(0, 999);
        this.proprietario = proprietario;
        this.saldo = 0.0;
    }

    //GETTER E SETTER
    public int getNumeroConto() {
        return numeroConto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double saldo() {
        return saldo;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean versamento(double somma) {
        if (somma > 0) {
            this.saldo += somma;
            return true;
        } else {
            return false;
        }
    }
    public boolean prelievo(double somma) {
        if (somma > 0 && this.saldo - somma >= 0) {
            this.saldo -= somma;
            return true;
        } else {
            return false;
        }
    }

}

