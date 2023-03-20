package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 2;
        
        //Persona.MI_CONSTANTE = 54;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //la palabra final en objetos 
        //no permite la asignacion a nuevas referencias 
//      persona1 = new Persona();
//      pero si se pueden modificar los atributos 
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre:" + persona1.getNombre());
        
        
    }
}
