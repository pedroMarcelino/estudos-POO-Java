public class contaBancaria {
    //atributos
    private String titular;
    private double saldoCC;

    //getter e setter - metodos padroes para acessar e modificar os conteudos;

    // metodo para obter titutar
    public String getTitular() {
        return titular;
    }

    //metodo para alterar o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    //contrutor com atributos
    public contaBancaria( String titular, double saldoCC){
        this.titular = titular;
        this.saldoCC = saldoCC;
    }

    //contrutor sem atributos
    public contaBancaria() {
    }

    //contrutor inicializando apenas com o nome e conta zerada
    public contaBancaria(String titular){
        this.titular = titular;
        this.saldoCC = 0;
    }
}
