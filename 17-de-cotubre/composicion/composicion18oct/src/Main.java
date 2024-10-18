import clases.*;

public class Main {
    public static void main(String[] args) {
        // Crear el recibo con los detalles de fecha, proveedor y otros datos
        Recibo recibo = new Recibo(27, 10, 2011, "Limpituc SA", 2023);
        recibo.serTipo('R');  // Establecer el tipo de comprobante como 'R' (Recibo)
        recibo.setNumero(1);   // Establecer el número de comprobante
        recibo.setDetalle("Pago de servicio jardinería");  // Establecer el detalle del recibo
        recibo.setTotal(350);  // Establecer el total del recibo

        // Instanciar la clase Mostrar para mostrar los detalles del recibo
        Mostrar mostrar = new Mostrar();
        mostrar.mostrar(recibo);  // Llamar al método para mostrar el recibo
    }
}
