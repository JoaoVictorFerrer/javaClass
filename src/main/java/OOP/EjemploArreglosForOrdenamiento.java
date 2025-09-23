package OOP;

import java.util.Arrays;

public class EjemploArreglosForOrdenamiento {
    public static void main(String[] args) {

        String[] productos = {"maquina de lavar","maquina de lavar","horno microondas","televisor","licuadora"};

//        este es una forma de inicialzar un array


//        String[] productos = new String[5];

//        productos[0] = "maquina de lavar";
//        productos[1] = "refrigerador";
//        productos[2] = "horno microondas";
//        productos[3] = "televisor";
//        productos[4] = "licuadora";


        int total = productos.length;
        int contador = 0;
        for(int i= 0; i < total; i++ ){
            for(int j= 0; j < total;j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
                System.out.println("contador = " + contador);

        for(int i=0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);

        }
    }
}
