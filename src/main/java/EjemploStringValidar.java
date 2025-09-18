public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = " ";
        }

        boolean esVacio = curso.length() >= 0;
        boolean esVcio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank(); // valida si contine espaciones en blanco.
        System.out.println("esVcio2 = " + esVcio2);
        System.out.println("esVacio = " + esVacio);
        System.out.println("esBlanco = " + esBlanco);
        
        if(esBlanco) {
            System.out.println("El curso esta vacio");
        }else {
            System.out.println(curso.toUpperCase());
        // el + no tierar el error exceptionnullpointer pero lo concatena com null
            System.out.println("Bienvenido al curso de " + curso);

        }

    }

}
