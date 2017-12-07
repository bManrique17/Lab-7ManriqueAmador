
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class hilo extends Thread{
    
    private Cliente cliente;
    private boolean bandera;

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public hilo(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    @Override
    public void run(){
        String nCliente = cliente.getNombre();
        String nCajero = cliente.getOrden().getCajero().getNombre();
        venta actual = cliente.getOrden().getCajero().getVentana();
        actual.getJl_nombreCajero().setText("Cajero: "+nCajero);
        actual.getJl_nombreCliente().setText("Cliente: "+nCliente);
        JTable tabla = actual.getTablaCompra();
        
        
        while(true){
            if(bandera){
                for (Producto p : cliente.getOrden().getListaProductos()) {
                    actual.getTf_procesando().setText(p.getNombre());
                    try {
                        Thread.sleep(p.getTiempoProcesameinto()*1000);
                    } catch (InterruptedException ex) {
                        
                    }
                    Object [] row = {p.getNombre(),cliente.getNombre(),p.getTiempoProcesameinto()};
                    DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    actual.getTablaCompra().setModel(m);
                }
                bandera = false;
            }
            
        }
    }
    
    
}
