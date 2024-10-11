package clases;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    // Constructor que solo recibe el nombre
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Constructor completo
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}

/* package clases;

public class Empleado {
    private String nombre, cargo;
    private double salario;

    public Empleado(String nombre){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(String nombre, String cargo, double salario){

    }
    
    public void setNombre(String nombre){

        this.nombre = nombre;
        }
        public void setNombre(String nombre){
        this.cargo = cargo;
        }
        public void setSalario(Double nombre){
        this.salario = salario;
        }

        public String getNombre(){
            return nombre;

        }
        public String getCargo(){
            return cargo;

        }
        public String getSalario(){
            return nombre;

        }
    }


}
*/