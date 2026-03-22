package abstracao;

public class main {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das flores", "mongagua", "1235", "SP", "135487", "Pedro", "645564", "asd");
        Cliente Kaio = new Cliente("Rua asd err", "Santos", "SP", "135487", "Kiao", "645564");

        System.out.println(joao);
        System.out.println(Kaio);
    }
}
