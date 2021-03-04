package app.entidades_herencia;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String rut;
    private String anioNacimiento;

    public Persona(String nombre, String apellido, String rut, String anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.anioNacimiento = anioNacimiento;
    }

    public void doSomething(){
        System.out.println("Doing something");
    } 

}
