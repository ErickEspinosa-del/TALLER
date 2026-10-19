package Empleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación del Empleado 1
        System.out.println("=== Registro del Empleado 1 ===");
        System.out.print("Primer nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Salario mensual: ");
        double salario1 = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);

        // Creación del Empleado 2
        System.out.println("\n=== Registro del Empleado 2 ===");
        System.out.print("Primer nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellido2 = scanner.nextLine();
        System.out.print("Salario mensual: ");
        double salario2 = scanner.nextDouble();

        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        // Mostrar salarios anuales iniciales
        System.out.println("\n--- SALARIOS ANUALES INICIALES ---");
        System.out.printf("Empleado 1: %s %s - Salario Anual: $%.2f\n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.obtenerSalarioAnual());
        System.out.printf("Empleado 2: %s %s - Salario Anual: $%.2f\n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.obtenerSalarioAnual());

        // Aplicar aumento del 10%
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        // Mostrar salarios anuales después del aumento
        System.out.println("\n--- SALARIOS ANUALES CON 10% DE AUMENTO ---");
        System.out.printf("Empleado 1: %s %s - Nuevo Salario Anual: $%.2f\n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.obtenerSalarioAnual());
        System.out.printf("Empleado 2: %s %s - Nuevo Salario Anual: $%.2f\n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.obtenerSalarioAnual());

        scanner.close();
    }
}
