import javax.swing.JOptionPane;

public class Ocho {
    public static void main(String []david){
        short sueldo;
        sueldo=Short.parseShort(JOptionPane.showInputDialog("Ingrese su sueldo:"));
        if(sueldo>3000){
            JOptionPane.showMessageDialog(null,"Debe pagar impuestos");
        }else{
            JOptionPane.showMessageDialog(null,"No debe pagar impuestos");
        }
    }
}
