package OOP;

import java.util.Arrays;

public class EjemploArreglosFOR {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "maquina de lavar";
        productos[1] = "refrigerador";
        productos[2] = "horno microondas";
        productos[3] = "televisor";
        productos[4] = "licuadora";

        Arrays.sort(productos); // odenar de forma alfabetica

        System.out.println("===============uSANDO FOR ==============");
        int total = productos.length;
        for(int i=0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);

        }

        System.out.println("===============uSANDO FOREACH ==============");

        for (String prod : productos){
            System.out.println("prod = " + prod);
        }


        System.out.println("===============uSANDO WHILE ==============");
        int i = 0;
        while( i < total){
            System.out.println("productos[i] = " + productos[i]);
            i++;
        }



        int[] numeros = new int[4];

        Arrays.sort(numeros);


    }
}
