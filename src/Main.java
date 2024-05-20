import Decorator.TelefonoBasico;
import Decorator.TelefonoInteligente;
import Decorator.TelefonoNextGen;

public class Main {
    public static void main(String[] args) {

        //TelefonoBasico telefonoBasico = new TelefonoBasico();
        //telefonoBasico.crear();

        //TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        //telefonoInteligente.crear();

        TelefonoNextGen telefonoNextGen = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        telefonoNextGen.crear();

        //TelefonoNextGen telefonoNextGen2 = new TelefonoNextGen(new TelefonoBasico());
        //telefonoNextGen2.crear();
    }
}