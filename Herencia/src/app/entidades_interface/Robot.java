package app.entidades_interface;

public class Robot implements Persona{

    private String serial;

    public Robot(String serial){
        this.serial = serial;
    }

    @Override
    public void caminarDerecho() {
        System.out.println("Avanzando Derecho");

    }

    @Override
    public void girarDerecha() {
        System.out.println("Giro A la Derecha");

    }

    @Override
    public void girarIzquierda() {
        System.out.println("Giro a la Izquierda");

    }
    
}
