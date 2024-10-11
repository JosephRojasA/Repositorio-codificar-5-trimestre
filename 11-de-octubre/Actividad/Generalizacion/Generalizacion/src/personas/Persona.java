public class Persona {
    private String nombre;  // propiedad
    private int edad;       // propiedad

    public Persona() {  // constructor vacío
    }

    // Asesor de edad
    public int getEdad() {
        return edad;
    }

    // Mutador de edad
    public void setEdad(int val) {
        this.edad = val;
    }

    // Asesor de nombre
    public String getNombre() {
        return nombre;
    }

    // Mutador de nombre
    public void setNombre(String val) {
        this.nombre = val;
    }
}
