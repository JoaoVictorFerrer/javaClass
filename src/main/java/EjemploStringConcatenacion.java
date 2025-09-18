public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = " Joao ";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int NumeroA = 18;
        int NumeroB = 20;

        // una forma de visualizar la concatenacion de numero junto con un string
        System.out.println( detalle + NumeroA + NumeroB );
        //cuando priorizamos el calculo se comporta de manera correcta para el calculo.
        System.out.println( detalle + (NumeroA + NumeroB ));

        // los string son inmutables no cambia cuando los concatenamos se hace otra referencia oto objeto al nuevo string
        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);

        // otras formas de concatenar
        String detalle3 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle3 = " + detalle3);

    }
}
