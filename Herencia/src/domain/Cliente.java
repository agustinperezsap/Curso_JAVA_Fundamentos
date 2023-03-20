package domain;

import domain.Persona;
import java.util.Date;

public class Cliente extends Persona {

    private Date fechaRegistro;
    private int idCliente;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{fechaRegistro=").append(this.fechaRegistro);
        sb.append(", idCliente=").append(this.idCliente);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
