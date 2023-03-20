
package proyectoCaja;

public class Caja {
    //Atributos
    int ancho;
    int alto;
    int profundo;
    
    //Constructor Vacio
    public Caja(){
        System.out.println("Ejecutando constructor");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    //Metodos
    public int calcularVolumen(){
        return ancho*alto*profundo;
    }
    
}
