import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una fecha con este formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha ingresada = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha actual = " + fecha2);
            if(fecha.after(fecha2)){
                System.out.println("Fecha ingresada por el ususario es despues  de la fecha acutal");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha ingresada es anterior a la fecha actual");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
