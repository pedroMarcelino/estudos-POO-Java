package execao.Verificadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    //C:\Users\phmar\Documents\projetos\java\estudosPOO\src\execao\textoAula.txt

    //content:

    /*
     * Lorem Ipsum is simply dummy text of the printing and typesetting industry.
     * Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
     * when an unknown printer took a galley of type and scrambled it to make a type
     * specimen book. It has survived not only five centuries, but also the leap into
     * electronic typesetting, remaining essentially unchanged. It was popularised in
     * the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
     * and more recently with desktop publishing software like Aldus PageMaker
     * including versions of Lorem Ipsum.
     * */


    public static void main(String[] args) {
        BufferedReader bfReader = null;

        try {
            bfReader = new BufferedReader(
                    new FileReader("C:\\Users\\phmar\\Documents\\projetos\\java\\estudosPOO\\src\\execao\\textoAula.txt"));

            //ler linha por linha
            String linha;
            while ((linha = bfReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
