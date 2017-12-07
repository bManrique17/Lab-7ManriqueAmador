
import java.util.ArrayList;


public class Cajero {
    
    private String nombre,id;
    ArrayList<Orden>listOrdenes = new ArrayList();
    venta ventana;
    hilo hilo;

    public hilo getHilo() {
        return hilo;
    }

    public void setHilo(hilo hilo) {
        this.hilo = hilo;
    }
    
    
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public venta getVentana() {
        return ventana;
    }

    public void setVentana(venta ventana) {
        this.ventana = ventana;
    }
    
    
    
    public Cajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Orden> getListOrdenes() {
        return listOrdenes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setListOrdenes(ArrayList<Orden> listOrdenes) {
        this.listOrdenes = listOrdenes;
    }
    
    
    
}
