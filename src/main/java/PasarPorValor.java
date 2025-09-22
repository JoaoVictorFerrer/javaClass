public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println(" finalizo con i = " + i); // no cambia el valor porque son inmutable por eso cuando se modifica se cambia la instacia pero la anterior se mantiene instancia

    }

    public static void test(int i){
        System.out.println("estamos iniciando el test com  i = " + i);
        i =35;

        System.out.println("finalizo el metodo test con i = " + i);
    }
}
