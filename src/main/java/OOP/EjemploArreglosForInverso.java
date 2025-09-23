package OOP;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = {"maquina de lavar","maquina de lavar","horno microondas","televisor","licuadora"};

//        este es una forma de inicialzar un array


//        String[] productos = new String[5];

//        productos[0] = "maquina de lavar";
//        productos[1] = "refrigerador";
//        productos[2] = "horno microondas";
//        productos[3] = "televisor";
//        productos[4] = "licuadora";

        Arrays.sort(productos); // odenar de forma alfabetica

        System.out.println("===============uSANDO FOR  Inverso==============");
        int total = productos.length;
        for(int i=0; i < total; i++){
            System.out.println("Para indice " + (total-1-i) + " : " + productos[total-1-i]);

        }

        System.out.println("===============uSANDO FOR  Inverso 2==============");

        for(int i= total -1; i>=0 ;i-- ){
            System.out.println("productos  = " + productos[i]);
        }



    }
}
