package clasesagregacion;

public class Comprobante {
    
    
    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante() {}

    public Comprobante(char tipo, int numero, Fecha f) {
        setTipo(tipo);
        setNumero(numero);
        setFecha(fecha);
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha val) {
        this.fecha = val;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char val) {
        this.tipo = val;
    }
}
