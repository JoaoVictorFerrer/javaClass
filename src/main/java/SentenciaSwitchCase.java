public class SentenciaSwitchCase {
    public static void main(String[] args) {

         int num = 3;
        switch (num){ // soporta  tambein string y primitivos menos

            case 0:
                System.out.println("es 0 ");
                break; // par que no continue el los otros casos.
            case 1:
                System.out.println("es 1 ");
                break;
            default:
                System.out.println("numeor o caracter desconochido");
        }

    }
}
