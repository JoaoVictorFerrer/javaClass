public class EjemploString {
    public static void main(String[] args) {

        String curso = "curso de programacion";
        String curso2 = new String("curso de prOgramacion");

        //son diferente por que el string es un objeto por tanto son de referencia  siendo asi diferentes
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        // comporando el valor en si de los strings
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        // Como no estoy utilizadno una nueva instancia com new , JAVA para optimizar utiliza el mismo objeto misma referencia que curso
        String curso3 = "curso de programacion";
        esIgual = curso == curso3;
        System.out.println("curso3 = " + esIgual);
    }
}
