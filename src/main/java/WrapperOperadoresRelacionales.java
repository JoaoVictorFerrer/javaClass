public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 =num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo numero " + (num1 == num2)); // estos contitne el mismo valor y el misma instancia , y el == compara las instancias

        num2 =1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo numero " + (num1 == num2)); // comparacion por instacia de objetos
        System.out.println("Son el mismo numero " + (num1.equals(num2))); // comparacio por valor
        
        //TODO con  el Boolean puedes comparar com ========
    }
}
