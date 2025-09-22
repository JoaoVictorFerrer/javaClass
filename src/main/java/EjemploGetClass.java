import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        
       Class strClas = texto.getClass();

        System.out.println("strClas.getName() = " + strClas.getName()); // retornar el packege y tipo
        System.out.println("strClas.getName() = " + strClas.getSimpleName()); // retorna que tipo es
        System.out.println("strClas.getName() = " + strClas.getPackageName()); // retorna solo el package
        
        for(Method m:strClas.getMethods()){
            System.out.println("m.getName() = " + m.getName()); // va listar todos los metodos 
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSimpleName());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
    }
}
