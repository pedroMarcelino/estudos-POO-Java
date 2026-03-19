package associacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List<funcionarios> listaFuncionarios;

    public Departamento(String nome, List<funcionarios> listaFuncionarios) {
        this.nome = nome;
        this.listaFuncionarios = listaFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<funcionarios> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<funcionarios> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void mostrarFuncionarios (){
        System.out.println("Departamento: " + nome);
        listaFuncionarios.forEach(funcionarios -> System.out.println(funcionarios));
    }
}
