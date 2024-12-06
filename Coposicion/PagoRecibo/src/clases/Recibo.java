package clases;

public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    // Constructor que inicializa los parámetros de Comprobante y Proveedor
    public Recibo(int dia, int mes, int anio, String razonSocial, int codigo) {
        super(dia, mes, anio);  // Llama al constructor de la superclase (Comprobante)
        this.proveedor = new Proveedor(razonSocial, codigo);  // Instancia el proveedor
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

    // Método para mostrar los datos del recibo
    public void mostrar() {
        System.out.println("Tipo de comprobante: " + getTipo());
        System.out.println("Número: " + getNumero());
        System.out.println("Fecha: " + getFecha().getDia() + "/" + getFecha().getMes() + "/" + getFecha().getAnio());
        System.out.println("Proveedor: " + proveedor.getRazonSocial() + ", Código: " + proveedor.getCodigo());
        System.out.println("Detalle: " + detalle);
        System.out.println("Total: $" + total);
    }
}
