package Clases;

public class Main {
    public static void main(String[] args) {
        Fecha hoy = new Fecha(20, 10, 2011);
        Producto pro1 = new Producto(1, "Café", 8.5f);
        Producto pro2 = new Producto(2, "Media Luna", 2f);
        Cliente cliente = new Cliente(1, "Juana");

        Factura f1 = new Factura('F', 1, hoy, cliente);
        f1.agregarProducto(pro1);
        f1.agregarProducto(pro2);
        f1.mostrar();
    }
}
