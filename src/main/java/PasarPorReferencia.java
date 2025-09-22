public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,12,13,14,51};

        System.out.println("iniciamos el metodo main ");

        for ( int i = 0 ; i < edad.length ; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("antes de llamar al metodo test ");
        test(edad);
        System.out.println("Despues de llamar al metodo test ");

        for ( int i = 0 ; i < edad.length ; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println(" finalizo el metodo main  con losd atos del arreglo modificado" ); // no cambia el valor porque son inmutable por eso cuando se modifica se cambia la instacia pero la anterior se mantiene instancia

    }

    public static void test(int[] edadArr){
        System.out.println("estamos iniciando el test " );

        for ( int i = 0; i< edadArr.length; i++){

            edadArr[i] = edadArr[i] + 10;
        }

        System.out.println("finalizo el metodo test");
    }
}
