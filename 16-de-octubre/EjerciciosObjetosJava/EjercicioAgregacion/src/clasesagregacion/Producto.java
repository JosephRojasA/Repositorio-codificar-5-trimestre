package clasesagregacion;

public class Producto {

    private int codigo;
    private String descripcion;
    private float precio;

    public void setCodigo (int codigo){
        this.codigo = codigo;

    }

    public int getCodigo(){
        return codigo;
    }

    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;

    }

    public String getDescipcion(){
        return descripcion;
    }

    public void setPrecio (float precio){
        this.precio = precio;

    }

    public float getPrecion(){
        return precio;
    }
}