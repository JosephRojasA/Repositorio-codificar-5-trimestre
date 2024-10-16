package clasesherencia;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(){

    }

    public void setNombre(String nombre){//creando un metodo
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }
public void setEdad(int edad){

    this.edad = edad;
}

public int getEdad() {
    return edad;
}

}
