
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Orden {
    
    private Cajero cajero;
    private Cliente cliente;
    ArrayList<Producto>listaProductos = new ArrayList();

    public Orden(Cajero cajero, Cliente cliente) {
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    
}
