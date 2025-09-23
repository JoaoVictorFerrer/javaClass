import java.util.Properties;

public class EjemploPropiedadesDeSistema {

    public static void main(String[] args) {
        //puedo buscar todas las propiedades en google getProperty
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);


        //Toda las propiedades
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
