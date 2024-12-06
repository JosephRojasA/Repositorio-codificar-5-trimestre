package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Factura extends Comprobante {
    private ArrayList<Producto> mProducto = new ArrayList<>();
    private float total;
    private Cliente mCliente;

    public Factura() {}

    public Factura(char t, int n, Fecha f, Cliente cli) {
        super(t, n, f);
        setCliente(cli);
    }

    public Cliente getCliente() {
        return mCliente;
    }

    public void setCliente(Cliente val) {
        this.mCliente = val;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float val) {
        this.total = val;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    public void setProducto(ArrayList<Producto> val) {
        this.mProducto = val;
    }

    public void agregarProducto(Producto p) {
        mProducto.add(p);
        setTotal(getTotal() + p.getPrecio());
    }

    public void mostrarProductos() {
        Iterator<Producto> iter = mProducto.iterator();
        while (iter.hasNext()) {
            Producto p = iter.next();
            System.out.printf("Código: %d Descripción: %s Precio: %5.2f \n",
                p.getCodigo(), p.getDescripcion(), p.getPrecio());
        }
    }

    public void mostrar() {
        System.out.printf("Tipo: %c Número: %d Fecha: %d/%d/%d\n",
            getTipo(), getNumero(), getFecha().getDia(), getFecha().getMes(), getFecha().getAnio());
        System.out.println("Cliente:");
        System.out.printf("Código: %d Razón Social: %s\n",
            mCliente.getCodigo(), mCliente.getRazonSocial());
        System.out.println("Productos:");
        mostrarProductos();
        System.out.printf("Total: %6.2f\n", getTotal());
    }
}
