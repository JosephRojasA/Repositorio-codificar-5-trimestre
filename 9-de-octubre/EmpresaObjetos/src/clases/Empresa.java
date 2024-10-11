package clases;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    // Constructor de la clase Empresa
    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }

    // Método que agrega empleados a la empresa
    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Método que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }

    // Método que muestra el nombre y salario de todos los empleados
    public void nombreSalario() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }

    // Método que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.getSalario();
        }
        return total;
    }

    // Método que muestra el nombre, cargo y salario del empleado que más dinero gana
    public void empleadoMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double maxSalario = empMayorSalario.getSalario();
        for (Empleado e : empleados) {
            if (e.getSalario() > maxSalario) {
                maxSalario = e.getSalario();
                empMayorSalario = e;
            }
        }
        System.out.println("El empleado que más dinero gana es:");
        System.out.println("Nombre: " + empMayorSalario.getNombre());
        System.out.println(" Cargo: " + empMayorSalario.getCargo());
        System.out.println(" Salario: " + empMayorSalario.getSalario());
    }

    // Método que muestra el nombre, cargo y salario del empleado que menos dinero gana
    public void empleadoMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double minSalario = empMenorSalario.getSalario();
        for (Empleado e : empleados) {
            if (e.getSalario() < minSalario) {
                minSalario = e.getSalario();
                empMenorSalario = e;
            }
        }
        System.out.println("El empleado que menos dinero gana es:");
        System.out.println("Nombre: " + empMenorSalario.getNombre());
        System.out.println( " Cargo: " + empMenorSalario.getCargo());
        System.out.println(" Salario: " + empMenorSalario.getSalario());
        
        
    }
    //Metodo que muestra el nombre dcargo y salario del empleado que menos salario gana

    
    }



 /*package clases;
import java.util.ArrayList;


public class Empresa {
    private ArrayList<empleado> empleados;
public Empresa() {

    String empleados = new ArrayList<empleado>();

 }//metodo que agrega empleados a la empresa
 public void contratarEmpleado(Empleado e) {
 empleados.add(e);

 }


 //metodo que obtiene el total de empleados
 public int getTotalEmpleados(){
    return empleados.seze();

 }

 //metodo que muestra el nombre de los salarios de todos los empleados

 public void nombreSalario(){
    for(Empleado e: empleados){

        System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
    }

 }

 //Metodo que retorna el total del dinero pagado a todos los empleados

 public double getTotalSalarios(){
    double total = 0;

    for(Empleado e:empleados) {
       total = total + e.getSalario();
    }
    return total
 }

 //metodo que muestra el nombre, cargo y salario del empleado que mas salario

 public void empleadoMayorSalario(){

    Empleado empMayorSalario = empleados.get(0);
    double maxSalario = empleados.get(0).getSalario();
    for(Empleado)
 }
}*/