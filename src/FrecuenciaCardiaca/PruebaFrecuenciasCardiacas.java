package FrecuenciaCardiaca;

import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE FRECUENCIA CARDÍACA ===");
        System.out.print("Primer nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Día de nacimiento (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = scanner.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        System.out.println("\n--- INFORMACIÓN DE LA PERSONA ---");
        System.out.printf("Nombre completo: %s %s\n", persona.getPrimerNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %d/%d/%d\n", persona.getMesNacimiento(), persona.getDiaNacimiento(), persona.getAnioNacimiento());
        System.out.printf("Edad: %d años\n", persona.calcularEdad());
        System.out.printf("Frecuencia cardiaca máxima: %d lpm\n", persona.calcularFrecuenciaCardiacaMaxima());
        System.out.printf("Rango de frecuencia cardiaca esperada: %s\n", persona.calcularFrecuenciaCardiacaEsperada());

        scanner.close();
    }
}
