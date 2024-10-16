package clasesagregacion;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {}

    public Fecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAnio(a);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int val) {
        this.anio = val;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int val) {
        this.dia = val;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int val) {
        this.mes = val;
    }
}
