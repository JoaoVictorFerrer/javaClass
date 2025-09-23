import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat(" EEEE dd 'de' MMMM,yyyy");

        String fechaStr = df.format(fecha);
        String fechaStr2 = df2.format(fecha);
        String fechaStr3 = df3.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
        System.out.println("fechaStr2 = " + fechaStr2);
        System.out.println("fechaStr3 = " + fechaStr3);

        long j = 0L;
        for ( int i = 0; i < 1000000; i++){
            j += i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() -  fecha.getTime(); // la fecha en milisengundos desde 1970
        System.out.println("Tiempo transcurido en el for = " + tiempoFinal + " ms");
    }
}
