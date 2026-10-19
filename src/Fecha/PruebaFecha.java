package Fecha;

import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (1-31):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año (ej. 2026):"));

        Fecha fecha = new Fecha(mes, dia, anio);
        fecha.mostrarFecha();
    }
}