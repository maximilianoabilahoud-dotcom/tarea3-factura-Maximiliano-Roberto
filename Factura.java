 import java.util.Scanner;

public class Factura {

    static final double IVA = 0.21;
    static final String PROPIETARIO = "maximilianoabilahoud-dotcom";

    public static double calcularBase(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static double calcularDescuento(double base, boolean esSocio) {
        double descuento = 0.0;
        if (base > 100) {
            descuento += base * 0.10;
        }
        if (esSocio) {
            descuento += base * 0.05;
        }
        return descuento;
    }

    public static double calcularTotal(double base, double descuento) {
        return (base - descuento) * (1 + IVA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== FACTURA de " + PROPIETARIO + " ===");
        System.out.print("Producto: ");
        String producto = sc.nextLine();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Es cliente socio (s/n): ");
        String socio = sc.next();

        boolean esSocio = socio.equalsIgnoreCase("s");

        double base = calcularBase(precio, cantidad);
        double descuento = calcularDescuento(base, esSocio);
        double total = calcularTotal(base, descuento);

        System.out.println("Producto: " + producto);
        System.out.printf("Base: %.2f euros%n", base);
        System.out.printf("Descuento: %.2f euros%n", descuento);
        System.out.printf("Total con IVA: %.2f euros%n", total);

        sc.close();
    }
}