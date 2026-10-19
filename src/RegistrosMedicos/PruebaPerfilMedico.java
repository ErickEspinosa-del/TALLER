package RegistrosMedicos;

import javax.swing.JOptionPane;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura en centímetros (ej. 175):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso en kilogramos (ej. 70):"));

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        String reporte = String.format(
                "=== REGISTRO MÉDICO ===\n" +
                        "Nombre: %s %s\n" +
                        "Sexo: %s\n" +
                        "Fecha de Nacimiento: %d/%d/%d\n" +
                        "Altura: %.1f cm\n" +
                        "Peso: %.1f kg\n" +
                        "Edad: %d años\n" +
                        "Índice de Masa Corporal (BMI): %.2f\n" +
                        "Frecuencia Cardíaca Máxima: %d lpm\n" +
                        "Rango Cardíaco Esperado: %s\n\n" +
                        "--- VALORES DE BMI ---\n" +
                        "Bajo peso: menos de 18.5\n" +
                        "Normal: entre 18.5 y 24.9\n" +
                        "Sobrepeso: entre 25 y 29.9\n" +
                        "Obeso: 30 o más",
                perfil.getPrimerNombre(), perfil.getApellido(),
                perfil.getSexo(),
                perfil.getDiaNacimiento(), perfil.getMesNacimiento(), perfil.getAnioNacimiento(),
                perfil.getAltura(), perfil.getPeso(),
                perfil.calcularEdad(),
                perfil.calcularBMI(),
                perfil.calcularFrecuenciaCardiacaMaxima(),
                perfil.calcularFrecuenciaCardiacaEsperada()
        );

        JOptionPane.showMessageDialog(null, reporte);
    }
}