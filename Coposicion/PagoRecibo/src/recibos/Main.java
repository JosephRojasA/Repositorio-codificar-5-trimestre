package recibos;

import clases.*;

public class Main {
    public static void main(String[] args) {
        // Instancia un recibo con fecha y datos del proveedor
        Recibo recibo = new Recibo(27, 10, 2011, "Limpituc SA", 2023);

        // Asignación de otros valores
        recibo.setTipo('R');
        recibo.setNumero(1);
        recibo.setDetalle("Pago de servicio jardinería");
        recibo.setTotal(350);

        // Muestra los datos del recibo
        recibo.mostrar();
    }
}
