public class Profesor extends Persona {
    private String materia;  // propiedad
    private String cargo;    // propiedad

    public Profesor() {  // constructor vacío
    }

    // Asesor de cargo
    public String getCargo() {
        return cargo;
    }

    // Mutador de cargo
    public void setCargo(String val) {
        this.cargo = val;
    }

    // Asesor de materia
    public String getMateria() {
        return materia;
    }

    // Mutador de materia
    public void setMateria(String val) {
        this.materia = val;
    }
}
