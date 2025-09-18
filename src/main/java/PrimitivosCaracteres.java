public class PrimitivosCaracteres {

    public static void main(String[] args) {
        char caracter = 'b';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("decimal = simbolo: " + (simbolo == decimal));


        char espacio = '\u0020';
        char retroceso ='\b';
        char tabulacion = '\t';
        System.out.println("retroceso = 2"  + tabulacion + retroceso + tabulacion);

    }
}
