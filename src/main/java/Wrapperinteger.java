public class Wrapperinteger {
    public static void main(String[] args) {

        Integer intObjeto = Integer.valueOf(32123);
        Integer intObjeto2 = 1234124;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "123451";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

    }
}
