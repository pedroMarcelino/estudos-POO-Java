package polimorfismo;

public class carro extends transporte{
    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
//        super.mover();
    }
}
