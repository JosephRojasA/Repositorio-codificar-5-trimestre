package clases;

public class Mostrar {
    public void mostrar(Recibo recibo) {
        System.out.printf("Tipo: %c Número: %d Fecha: %d/%d/%d\n",
            recibo.getTipo(), recibo.getNumero(),
            recibo.getFecha().getDia(), recibo.getFecha().getMes(), recibo.getFecha().getAnio());
        System.out.printf("Proveedor: \n");
        System.out.printf("Código: %d Razón Social: %s\n",
            recibo.getProveedor().getCodigo(), recibo.getProveedor().getRazonSocial());
        System.out.printf("Detalle: %s\n", recibo.getDetalle());
        System.out.printf("Total: %6.2f\n", recibo.getTotal());
    }
}
