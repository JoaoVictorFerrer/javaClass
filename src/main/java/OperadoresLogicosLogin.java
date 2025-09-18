import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//El operador ternario tiene que ser seimpre del mismo tipo el elemento qeu devuelve a la variable asignada

//        String[] usernames = new String[3];
//        String[] passwords = new String[3];
//
//        usernames[0] = "Joao";
//        passwords[0] = "123";
//
//        usernames[1] = "Admin";
//        passwords[1] = "123";
//
//        usernames[2] = "Piter";
//        passwords[2] = "123";

        //Otra forma de inicializar un arreglo de strings
        String[] usernames = {"Joao","Admin","Admin"};
        String[] passwords = {"123","123","123"};



        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean isAuth = false;
        for( int i = 0 ; i < usernames.length; i++ ){
            if( (usernames[i].equals(u)  && passwords[i].equals(p)) ) {
                isAuth = true;
                break;
            }

        }

        if (isAuth){
            System.out.println("Login correctamente ,Bienvenido ".concat(u));
        }else {
            System.out.println("usuario ".concat(u) + " no fue encontrado o contrasenha incorrecta" );
            main(args);
            System.exit(0);
        }


    }

}

