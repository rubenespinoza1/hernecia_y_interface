package app.entidades_interface;

public class Gato implements Persona {

    private String nombre;
    private String chip;

    public Gato(String nombre, String chip){
        this.chip = chip;
        this.nombre = nombre;
    }

    @Override
    public void caminarDerecho() {
        System.out.println("Caminando Derecho");

    }

    @Override
    public void girarDerecha() {
        System.out.println("Girando Derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Girando Izquierda");
    }
    
}
