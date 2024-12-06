package clases;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor que acepta día, mes y año
    public Fecha (int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        }
    /*public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
*/
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
