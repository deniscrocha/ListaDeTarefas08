package heranca;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Dênis", 5000);
        Gerente mestre = new Gerente("Jaques", 10000);
        System.out.println("Bonus do Jaques: " + mestre.calcularBonus());
        System.out.println("Bonus do Dênis: " + dev.calcularBonus());
        dev.trabalhar();
        mestre.trabalhar();
    }
}
