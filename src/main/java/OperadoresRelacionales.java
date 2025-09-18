public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 3.4f;
        double l = 2.14;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; // operador de negacion
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean  b5 = k >= l;
        System.out.println("b5 = " + b5);

    }
}
