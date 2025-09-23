import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); // es metodo se tiene que iinstanciar con getInstace e no com new

//        calendario.set(2020,4,21,19,20,21);
        calendario.set(Calendar.YEAR,2000);
        Date fecha =calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String fechaFormato = formato.format(fecha);

        System.out.println("fechaFormato = " + fechaFormato);

    }
}
