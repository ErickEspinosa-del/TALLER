package Factura;

import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        // Ingreso de datos mediante ventanas emergentes
        String numero = JOptionPane.showInputDialog("Ingrese el número de pieza:");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la pieza:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por artículo:"));

        Factura factura1 = new Factura(numero, descripcion, cantidad, precio);

        // Mostrar resultados
        String resultado = String.format(
                "--- DETALLES DE LA FACTURA ---\n" +
                        "Número de pieza: %s\n" +
                        "Descripción: %s\n" +
                        "Cantidad: %d\n" +
                        "Precio por artículo: $%.2f\n" +
                        "Monto total de la factura: $%.2f",
                factura1.getNumeroPieza(),
                factura1.getDescripcionPieza(),
                factura1.getCantidad(),
                factura1.getPrecioPorArticulo(),
                factura1.obtenerMontoFactura()
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}