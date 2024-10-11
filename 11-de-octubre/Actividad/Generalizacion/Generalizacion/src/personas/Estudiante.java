public class Estudiante extends Persona {
    private String carrera;  // propiedad
    private int legajo;      // propiedad

    public Estudiante() {  // constructor vacío
    }

    // Asesor de carrera
    public String getCarrera() {
        return carrera;
    }

    // Mutador de carrera (corregido a void)
    public void setCarrera(String val) {
        this.carrera = val;
    }

    // Asesor de legajo
    public int getLegajo() {
        return legajo;
    }

    // Mutador de legajo
    public void setLegajo(int val) {
        this.legajo = val;
    }
}
