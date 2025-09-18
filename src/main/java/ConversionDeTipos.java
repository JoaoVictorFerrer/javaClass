public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1231.23e-3";

        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr);

        double otroRealDobule = 123.123;
        String otroRealStr = Double.toString(otroRealDobule);
        System.out.println("otroRealStr = " + otroRealStr);

        String otroLogico = Boolean.toString(logicoBoolean);
        System.out.println("otroLogico = " + otroLogico);


        //la conversion se tiene que realizar con tipos de datos que soportan en tamanho ya que si no la conversion sera erronea
        int i = 42000;

        short s = (short) i; // estoy forzando la conversion.
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        char b = (char) i;
        System.out.println("b = " + b);
    }
}
