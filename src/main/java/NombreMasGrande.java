import javax.swing.*;

public class NombreMasGrande {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre y apellido");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre y apellido");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercero nombre y apellido");

        String[] arreglo1 =   nombre1.split(" ");
        String[] arreglo2 =   nombre2.split(" ");
        String[] arreglo3 =   nombre3.split(" ");


        int l1 = arreglo1[0].split("").length;
        int l2 = arreglo2[0].split("").length;
        int l3 = arreglo3[0].split("").length;

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);

        String nombreMax = l1 > l2 ? arreglo1[0] : arreglo2[0];
        int lmax = nombreMax.length();
               nombreMax = lmax > l3 ? nombreMax : arreglo3[0];


             System.out.println(nombreMax + " Tiene el nombre mas grande");

//
//        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//
//        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
//        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;
//
//        System.out.println("La persona con el nombre mas largo es " + max);

    }
}
