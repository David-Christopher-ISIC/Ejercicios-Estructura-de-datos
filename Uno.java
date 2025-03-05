import javax.swing.JOptionPane;

public class Uno {
    public static void main(String []david){
        byte x, area;
        x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la medida del lado del cuadrado"));
        area=(byte)(x*x);
        JOptionPane.showMessageDialog(null,"El área del cuadrado es: " + area);
    }
}
