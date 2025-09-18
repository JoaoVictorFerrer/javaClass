public class ExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.j2eg";
        System.out.println("archivo.length() = " + archivo.length());

        int i = archivo.lastIndexOf("."); // para buscar la ultimo caracter.
        System.out.println("i = " + i);
        System.out.println("archivo.subString = " + archivo.substring(i+1));

    }
}
