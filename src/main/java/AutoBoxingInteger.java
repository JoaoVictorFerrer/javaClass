public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1) ,2,3,4,5,6,7,8,9,10,11,12,13};

        int suma = 0;

        //forma explicita

        for (Integer i: enteros){
            if (i.intValue() % 2 == 0 ){ // ejemplo del unboxing
                suma += i.intValue();
            }
            System.out.println("suma = " + suma);

        }

        ///  forma implicita
        suma =0;
        for (Integer i: enteros){
            if (i % 2 == 0 ){ // ejemplo del unboxing
                suma += i;
            }
            System.out.println("suma = " + suma);

        }


    }

}
