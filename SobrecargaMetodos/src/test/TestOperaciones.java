
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado1 = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);
    }
}
