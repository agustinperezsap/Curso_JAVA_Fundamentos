package pasoporreferencia;

import clases.Persona;

public class asoporreferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        System.out.println("persona1  nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: " + persona1.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Karla";
        
    }
}
