import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese 3 nombres");
        String nombre1 = scanner.nextLine();
        String nombre2 = scanner.nextLine();
        String nombre3 = scanner.nextLine();
        String[] nombre1f = nombre1.split("");
        String[] nombre2f = nombre2.split("");
        String[] nombre3f = nombre3.split("");
        int l1 = nombre1f.length;
        int l2 = nombre2f.length;
        int l3 = nombre3f.length;
        String nombre1Modf = nombre1f[1].toUpperCase() + "." + nombre1.substring(l1-2);
        String nombre2Modf = nombre2f[1].toUpperCase() + "." + nombre2.substring(l2-2);
        String nombre3Modf = nombre3f[1].toUpperCase() + "." + nombre3.substring(l3-2);

        String resultado = nombre1Modf.concat("_").concat(nombre2Modf).concat("_").concat(nombre3Modf);

        System.out.println("resultado = " + resultado);

    //Resposta do professor

//        System.out.println("Ingrese un nombre de un familiar:");
//        String nombreA = scanner.nextLine();
//        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
//
//        System.out.println("Ingrese otro nombre de un familiar:");
//        String nombreB = scanner.nextLine();
//        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);
//
//        System.out.println("Ingrese otro nombre de un familiar:");
//        String nombreC = scanner.nextLine();
//        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);
//
//        String resultadopr = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
//
//        System.out.println(resultadopr);


    }
}
