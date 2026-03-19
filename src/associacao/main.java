package associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        carro fusca = new carro(25);
        fusca.mostrarCilindrada();

        funcionarios joao = new funcionarios("Joao");
        funcionarios joana = new funcionarios("Joana");
        funcionarios pedro = new funcionarios("pedro");

        List<funcionarios> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(joana);
        listaFuncionarios.add(joao);
        listaFuncionarios.add(pedro);

        Departamento ti = new Departamento("TI", listaFuncionarios);
        ti.mostrarFuncionarios();

        Departamento markt = new Departamento("Marketin", Collections.emptyList());
        markt.mostrarFuncionarios();
    }
}
