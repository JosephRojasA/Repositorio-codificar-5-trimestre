package clasesagregacion;

import java.util.ArrayList;



public class Factura extends Comprobante {
    private float total;
    private Cliente mcliente;
    private ArrayList<Producto> mProducto = new ArrayList<>();

    public Factura(char tipo, int numero, Fecha fecha, Cliente cliente) {
        super(tipo, numero, fecha);
        setCliente(cliente);
    }ss

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.mcliente = cliente;
    }

    public Cliente getCliente() {
        return mcliente;
    }

    public void setProducto(ArrayList<Prodcuto> prodcuto) {
        this.mProducto = prodcuto;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    public void agregarProducto(Producto p){
        
    }
}
