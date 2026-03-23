package execao.NaoVerificadas;

import execao.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verifca = verificaCPF(sc.nextLine());
        System.out.println(verifca);
    }

    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("123456")) {
                throw new ConflictException("CPF ja cadastrado");
            }else{
                return "usuario Cadastrado";
            }
        } catch (RuntimeException e) {
            throw  new ConflictException("CPF ja cadastrado");
        }
    }
}
