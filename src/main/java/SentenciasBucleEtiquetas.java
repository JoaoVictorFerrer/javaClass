public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        // asi es la forma de dar una etiqueta al um bucle
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++ ){

                if (i == 2) {
                    continue bucle1; // gracias a las etiquetas conseguimos interumpir o contuniar un bucle segun nos convenga
                }
                System.out.print("[i = " + i + ", j = " + j+ "], ");
            }
        }
        System.out.println("\n ===============================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++ ){

                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j+ "], ");
            }
        }

    }
}
