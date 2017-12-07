
import java.util.ArrayList;


public class Cliente {
    
    private String nombre,edad;
    private Orden orden;
    ArrayList<Producto> listProductos = new ArrayList();

    @Override
    public String toString() {
        return nombre;
    }
    
    public Cliente(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public Orden getOrden() {
        return orden;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }
    
    
    
    
    
}
