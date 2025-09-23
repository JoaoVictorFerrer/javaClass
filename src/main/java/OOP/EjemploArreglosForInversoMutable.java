package OOP;

import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
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

        int total = productos.length;

        System.out.println("===============uSANDO FOR  Inverso==============");
       for(int i = 0; i < total/2; i++){

           String actual = productos[i];
           String inverso = productos[total-1-i];
           productos[i] = inverso;
           productos[total -1-i] = actual;

       }
        System.out.println("===============  USANDO FOR  ==============");

        for(int i=0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);

        }


    }
}
