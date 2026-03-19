package associacao;

public class carro {
    //atributo tipo motor
    private motor motor;

    public carro(motor motor) {
        this.motor = motor;
    }

    public carro(int cilindradas){
        this.motor = new motor(cilindradas);
    }

    public void mostrarCilindrada (){
        System.out.println("Carro com o moto de " + motor.getCilindradas() + " cilindradas");
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }
}
