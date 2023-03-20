package test;

public class TestArreglos {

    public static void main(String[] args) {
        //los arreglos eredan del tipo object
        //una vez indicado la cantidad de  elementos,
        //este ya no puede crecer
        int edades [] = new int[3];
        
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        edades[1] = 9;
        edades[2] = 8;
        
        //como los arreglos son de tipo Object 
        //tambein tienen propiedades asi podesmos usar .lengh
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades " + i + ": " + edades[i]);
        }
        //sintaxis resumida de como crear un arrelo
        //String es una clase asi que el arreglo es 
        //de tipo Object, esta sintaxissirve entonces
        //para tipos primitivos y object
        String frutas[] = {"Naranja","Banana","Uva"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
        
    }
}
