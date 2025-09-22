
class Persona {

    private String nombre;

    public void modificarNormbre(String nuevoNombre){
        this.nombre = nuevoNombre; // significa la referencia sobre la clase o instacia // se puede omitir si el argumento es diference de la instancia
    }

    public String leerNombre(){
        return nombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNormbre("Joao");

        System.out.println("iniciamos el metodo main ");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("antes de llamar al metodo test ");
        test(persona);
        System.out.println("persona despues del test = " + persona.leerNombre());
        System.out.println(" finalizo el metodo main " );
    }

    public static void test(Persona persona){
        System.out.println("estamos iniciando el test " );

        persona.modificarNormbre("Thais");

        System.out.println("finalizo el metodo test" );
    }
}
