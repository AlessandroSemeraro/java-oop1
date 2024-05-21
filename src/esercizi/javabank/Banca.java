package esercizi.javabank;

public class Banca {
    public static void main(String[] args) {
        Conto conto1 = new Conto("Alessandro");

        System.out.println("Numero conto: " + conto1.getNumeroConto());
        System.out.println("Nome proprietario conto: " + conto1.getProprietario());
        System.out.println("Saldo del conto: " + conto1.getSaldo());

        conto1.versamento(300);
        conto1.prelievo(100);

        System.out.println(conto1.getSaldo());

    }
}
