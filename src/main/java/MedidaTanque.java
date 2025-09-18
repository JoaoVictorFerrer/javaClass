import javax.swing.*;

public class MedidaTanque {

    public static void main(String[] args) {

        String statusTanque = JOptionPane.showInputDialog("Ingrese un numero para saber el estado del tanque");
        double litros = Double.parseDouble(statusTanque);
        if(litros > 70){
            statusTanque = JOptionPane.showInputDialog("Por favor ingresar un numero menor o igual 70");
        }







    }
}
