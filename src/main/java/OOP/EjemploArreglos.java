package OOP;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "maquina de lavar";
        productos[1] = "refrigerador";
        productos[2] = "horno microondas";
        productos[3] = "televisor";
        productos[4] = "licuadora";

        Arrays.sort(productos); // odenar de forma alfabetica

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);





        int[] numeros = new int[4];

        numeros[0] =-5;
        numeros[1] =2;
        numeros[2] =(int) 3L; //puedo casterlos
        numeros[3] =-4;
//        numeros[4] =5; este supera el limite del arreglo.
        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1]; // para accder el ultimo valor tiene que ser su longitud menos 1 unidad

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
