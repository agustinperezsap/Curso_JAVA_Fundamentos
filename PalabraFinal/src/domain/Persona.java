package domain;

//uso de la palabra final en las clases nos dice que 
//no se pueden crear clases hija de este 
public final class Persona {
//    en las variables, el uso de la palabra final
//    impide el cambio de valor y se convierte en una constante
//    se recomienda que las constantes sean definidas mayusculas
//    separadas por guin bajo

    public final static int MI_CONSTANTE = 1;

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //uso de la palabra final en los metodos te indica que 
    //las clases hijas no pueden modificar su comportamiento 
    //pero si pueden se usados
    public void imprimir() {
        System.out.println("Metodo imprimir");
    }
}
