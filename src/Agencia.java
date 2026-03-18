public class Agencia {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria("Pedro Marcelino", 5000);

        minhaConta.setTitular("Pedro H. Marcelino");
        minhaConta.setSaldoCC(minhaConta.getSaldoCC() + 3850);

        String titularCC = minhaConta.getTitular();
        double saldoCC = minhaConta.getSaldoCC();
        System.out.println("Conta: " + titularCC + " com o saldo de: " + saldoCC);


        contaBancaria contaMinhaMae = new contaBancaria("Fabiana S. Marcelino");
        contaMinhaMae.setSaldoCC(contaMinhaMae.getSaldoCC()+153245);
        System.out.println("Conta: " + contaMinhaMae.getTitular() + " com o saldo de: " + contaMinhaMae.getSaldoCC());
    }
}
