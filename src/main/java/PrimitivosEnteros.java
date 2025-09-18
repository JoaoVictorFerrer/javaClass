public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte= 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println(" valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println(" valor maximo de un bite " + Byte.MIN_VALUE);


        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort = " + Short.BYTES);
        System.out.println(" valor maximo de un byte " + Short.MAX_VALUE);
        // tienes los mismo metodos para poder saber sus propiedades


        int numeroInt = 33000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println(" valor maximo de un int " + Integer.MAX_VALUE);

        long numeroLong = 21767676767767L;
        //SE NECESITA poner la L al final de un numero long apesar de especificar la clase Long
        System.out.println("numeroLong = " + numeroLong);

        var numeroVar = 127f;
        System.out.println("numeroVar = " + numeroVar);



    }
}
