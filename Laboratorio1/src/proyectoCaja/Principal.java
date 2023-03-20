package proyectoCaja;

public class Principal {

    public static void main(String[] args) {
        Caja caja = new Caja();
        var anacho = 3;
        var alto = 2;
        var profundo = 6;
        
        caja.alto = alto;
        caja.ancho = anacho;
        caja.profundo = profundo;
        
        var resultado = caja.calcularVolumen();
        System.out.println("resultado = " + resultado);
        
        Caja caja2 = new Caja(3, 2, 6);
        System.out.println("Resultados con argumentos: " + caja.calcularVolumen());
        
    }
}
