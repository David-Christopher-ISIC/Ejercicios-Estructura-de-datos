import javax.swing.JOptionPane;

public class Doce {
    public static void main(String []david){
        byte x;
        x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un número del 1 al 99:"));
        if(x<=9){
            JOptionPane.showMessageDialog(null,"El número "+x+" tiene 1 dígito");
        }else{
            JOptionPane.showMessageDialog(null,"El número "+x+" tiene 2 dígitos");
        }
    }
}
