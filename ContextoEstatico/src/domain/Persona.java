package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadoPersona;

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incremento el contador por cada objeto nuevo
        Persona.contadoPersona++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadoPersona() {
        return contadoPersona;
    }

    public static void setContadoPersona(int aContadoPersona) {
        contadoPersona = aContadoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
