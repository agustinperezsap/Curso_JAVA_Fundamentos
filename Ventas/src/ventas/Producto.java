package ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //los constructores privcados solo se pueden utilizar 
    //en la clase donde fue creado
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    //si se llama un contructor interno la primera linea dentro debe ser 
    //la palabra (this();)
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
