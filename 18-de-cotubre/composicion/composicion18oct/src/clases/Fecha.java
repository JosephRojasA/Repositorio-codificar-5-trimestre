package clases;

public class Fecha {

    private int dia;  
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        }
    public int getDia () {
        return dia;
    }
    public void setDia (int val){
        this.dia = val;
    }
   
    public void setMes (int val){
        this.mes = val;
    }
    public int getMes () {
        return mes;
    }
    public int getAnio () {
        return anio;
    }
    public void setAnio (int val){
        this.anio = val;
    }
   
    


    

}
