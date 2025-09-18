public class EjemploStringTestRendimiento {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        //a diferencia del string normal el stringBuilder es mutable
        StringBuilder sb = new StringBuilder(a);

        for( int i = 0; i < 10000; i++){
//            c = c.concat(a).concat(b).concat("\n");  // 500 => 1ms
//            c += a + b + " \n";                      // 500 => 6ms
              sb.append(c)                           // 500 => 0ms
                      .append(b)
                      .append("\n");

        }

        long fin = System.currentTimeMillis();
        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);


    }
}
