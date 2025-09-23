import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class EjemploAsignarPropiedadesSystems {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad","mI VALOR GUARDADO");
            System.setProperties(p);
            System.out.println("mi ps" + System.getProperty("config.puerto.servidor") );
            System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<String ,String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        System.out.println("Listando variables del sistema ---------------> ");

        for(String key: varEnv.keySet()){
            System.out.println(key + "=>" + varEnv.get(key));
        }
    }

}
