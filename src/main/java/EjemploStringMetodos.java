public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Joao victor";
        System.out.println("nombre.length = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Joao victor\") = " + nombre.equals("Joao victor"));
        System.out.println("nombre.compareToIgnoreCase(\"JoAo victor\") = " + nombre.equalsIgnoreCase("JoAo victor"));
        System.out.println("nombre.compareTo(\"Jo victor\") = " + nombre.compareTo("Jo victor"));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(2) = " + nombre.substring(2,7));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","e"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // retorna la primera posicion que contiene el primer argumento  si no lo encuentra devulve -1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // retorna el ultimo encontrado
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); // retorna un boolean y solo aceptas stringas y no char
        System.out.println(" Trabalenguas ".trim()); //elimina espacios en ambas direcciones
    }
}
