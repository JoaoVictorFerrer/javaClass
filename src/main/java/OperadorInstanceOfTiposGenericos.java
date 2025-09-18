public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
// para utilizar el instaceOF SOLO  se puede utilziar en tipos de refrencia.

        Object texto = " esto es un objeto clase String";

        Integer num = 1;  // esto es lo mismo Integer num = new Intenger (1)

        boolean validar = texto instanceof String; // todos los obejtos son del tipo Object

        System.out.println("texto es del tipo String = " + validar);

        boolean validar2 = texto instanceof Object;

        System.out.println("validar2 = " + validar2);

        boolean validar3 = num instanceof Integer;
        System.out.println("validar3 = " + validar3);

        boolean validar4 = num instanceof Number; // todo los numero porviene de la clase Absstracta Number
        System.out.println("validar4 = " + validar4);





    }
}
