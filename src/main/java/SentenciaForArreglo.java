import javax.swing.*;

public class SentenciaForArreglo {

    public static void main(String[] args) {
        String[] nombres = {"Andres","pepe","MARIA","Joao","Pepa"};
        int count = nombres.length;
        
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("Andres") ||
                    nombres[i].equalsIgnoreCase("pepe"))continue; // si cumple el if salta la iterecacion
            System.out.println(i + " " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresar un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for ( int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null," Nombre no Encontrado");
            main(args);
            System.exit(0);
        }
    }
}
