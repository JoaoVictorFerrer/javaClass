public class SentenciaBucleEtiquetas {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        for( int i= 0 ; i < max ; i++){

            if(frase.charAt(i) != 't'){
                continue;
            }
            cantidad++;
        }
        System.out.println("cantidad = " + cantidad);
        String nuevo = " ";
    }


}
