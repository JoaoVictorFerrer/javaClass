import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DescubreMiEdad {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dD-MM-yyyy");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese tu ano de nascimiento con este formato 'dd-MM-yyyy'");

        try {
            Date fechaActual = new Date();
            Date fechaIngresada = format.parse(s.next());
            long AnioEnMiliSegundo = 31536000000L;
            long EdadPorFecha = (fechaActual.getTime() - fechaIngresada.getTime())/AnioEnMiliSegundo;
            System.out.println("Tu edad es = " + EdadPorFecha + "anhos");
        } catch (ParseException e) {
            System.out.println("Por favor ingrese una fecha con el formato correcto");
            throw new RuntimeException(e);

        }


    }
}
