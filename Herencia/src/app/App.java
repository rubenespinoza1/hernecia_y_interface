package app;

import app.entidades_interface.Persona;
import app.entidades_interface.Gato;
import app.entidades_interface.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato("Chimino", "123443-1");
        Robot robot = new Robot("KALPPP-1");

        executeDoSomething(robot);
    }

    public static void executeDoSomething(Persona persona){
        persona.caminarDerecho();
        persona.girarDerecha();
        persona.girarIzquierda();
    }
}
