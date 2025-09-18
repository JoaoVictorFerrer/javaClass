public class EjemploStringInmutabilidad {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = " Joao ";

        //en este caso por mas que  utilizo concat el resutado sera curso ya que n o tengo otra instancia de objeto
        curso.concat(profesor);
        System.out.println("curso = " + curso);

        //pero si lo instacion con otro a otro string pues será aplicado el metodo de concat
        String resultado =    curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // podemos concatenar com otros metodos
        String resultado2 =  curso.transform(c -> {
            return c + " con " +profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        // cambiar carateres por otro
        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado); // vemos que resultado sigue giaul porque no estas asignado a otra variable

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

    }
}
