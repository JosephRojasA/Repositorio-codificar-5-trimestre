package clases;

public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(int dia, int mes, int anio, String razonSocial, int codigo) {
        super(dia, mes, anio);  // Relación de composición con Fecha
        this.proveedor = new Proveedor(razonSocial, codigo);  // Relación de composición con Proveedor
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String val) {
        this.detalle = val;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor val) {
        this.proveedor = val;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float val) {
        this.total = val;
    }
}
