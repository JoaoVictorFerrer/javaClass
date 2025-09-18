public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 3.4f;
        double l = 2.14;
        boolean m = false;


        boolean b1 = i < j && k > l && m == false; // todas tiene que ser true para que sea cierta
        System.out.println("b1 = " + b1);

        boolean b2 = i > j || k < l; // solo se tieone cumplier una condicion
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k > l || m == false); // con parantesesis puedo marcar prioridad en la evaluaxion de los logicos
        System.out.println("b3 = " + b3);

        boolean b4 = (i == j || k < l ) && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = true || true && false; // el && tiene prioridad sobre el OR || por ello evalua primero el AND
        System.out.println("b5 = " + b5);
    }
}
