import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {


        try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Introduce el nombre de la factura o descripcion");
                String facturaDescription = scanner.nextLine();

                System.out.println("Introduce el precio del primer producto");
                Double precio1 = scanner.nextDouble();

                System.out.println("Introduce el precio del segundo producto");
                Double precio2 = scanner.nextDouble();

                double totalPrecioSinImp = precio1 + precio2;
                double totalPrecioComImp= ((precio1 + precio2) * 119)/100;
                double impuesto = ((precio1 + precio2) * 0.19);

                System.out.println("La factura " + facturaDescription +
                        " tiene un total bruto de " + totalPrecioSinImp +
                        " con un imspuesto de " + impuesto +
                        " y el monto después de impuesto es de " + totalPrecioComImp);

            }catch (Exception e){
                System.out.println("por favor en los precios es necesario utilizar numeros");
                main(args);
                System.exit(0);
        }

    }
}
