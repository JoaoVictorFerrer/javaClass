public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for (int i = 0;i < largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }
            System.out.println();
            System.out.println("trabalenguas = " + trabalenguas.split("a"));

            String[] arreglo2 = trabalenguas.split("a");
            int l = arreglo2.length;

            for (int j=0; j < l; j++ ){
                System.out.println(arreglo2[j]);
            }

            String nombreArchivo = "Nombre.archivo.pdf";
            String[] arreglo3 =  nombreArchivo.split("\\." ); // cuando son carateres claves lo tenemos que escapar se puede scapar asi [.]
            int l2 = arreglo3.length;
            for (int t=0; t<l2; t++ ){
                System.out.println("arreglo3 = " + arreglo3[t]);
            }

            System.out.println("Extension: " + arreglo3[l2-1]);





    }
}
