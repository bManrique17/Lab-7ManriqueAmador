/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private String nombre,precio;
    private int tiempoProcesameinto;
    Orden orden;

    @Override
    public String toString() {
        return nombre;
    }
    
    public Producto(String nombre, String precio, int tiempoProcesameinto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProcesameinto = tiempoProcesameinto;
    }

    public int getTiempoProcesameinto() {
        return tiempoProcesameinto;
    }

    public void setTiempoProcesameinto(int tiempoProcesameinto) {
        this.tiempoProcesameinto = tiempoProcesameinto;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    
}
