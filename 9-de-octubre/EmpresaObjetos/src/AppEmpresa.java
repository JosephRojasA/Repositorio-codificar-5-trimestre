
import javax.swing.JOptionPane;

import clases.Empleado;  // Asegúrate de importar la clase Empleado
import clases.Empresa;   // Asegúrate de importar la clase Empresa
import clases.*;
public class AppEmpresa {
    public static void main(String[] args) throws Exception {
       
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de empleados: "));
        Empresa empresa = new Empresa();
        for(int emp =0; emp < cantidad; emp++){
            //lectura de los datos de cada empleado
            String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del empleado: ");
            String cargo = JOptionPane.showInputDialog(null, "ingrese el cargo del empleado: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el salario del empleado"));
            //adicion de cada empleado a la empresa

            empresa.contratarEmpleado(new Empleado(nombre, cargo,salario));
        }
        System.out.println("\nEl numero total de empleados es: " + empresa.getTotalEmpleados());
        
        System.out.println("\nLos nombres y lso salrios de los empleados son: ");  
        empresa.nombreSalario();

        System.out.println("\nTotal de dinero pagado a los empleados: " + empresa.getTotalSalarios());  
        
        }
}
/*Empresa empresa = new Empresa();
        
        // Aquí puedes agregar empleados, por ejemplo:
        Empleado empleado1 = new Empleado("Juan", "Gerente", 3500);
        empresa.contratarEmpleado(empleado1);

        // Llamar a los métodos que gestionan los empleados
        empresa.nombreSalario();
        empresa.empleadoMayorSalario();
        empresa.empleadoMenorSalario();*/ // Esta clase debería instanciar una Empresa y manejar las interacciones

/*public class AppEmpresa {
    public static void main(String[] args) throws Exception {
       
        
        public void setNombre(String nombre){


    }
}*/ 