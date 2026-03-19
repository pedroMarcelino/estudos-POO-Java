package polimorfismo;

public class main {
    public static void main(String[] args) {
        int escova = 5;
        int pasta = 3;
        double batata = 3.5;
        double cebola = 4.99;
        Integer patinho = 25;
        Integer picanha = 12;
        Integer costela = 18;

        int totalInt = calculadora.somar(escova, pasta);
        double totalDouble = calculadora.somar(batata,cebola);
        Integer totalInteger = calculadora.somar(patinho, picanha, costela);

        System.out.println(totalInt);
        System.out.println(totalDouble);
        System.out.println(totalInteger);
    }
}
