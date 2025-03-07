import javax.swing.JOptionPane;

public class Tres {
    public static void main(String []david){
        short x,p;
        x=Short.parseShort(JOptionPane.showInputDialog("Ingresa la medida del lado del cuadrado:"));
        p=(short)(x+x+x+x);
        JOptionPane.showMessageDialog(null,"El perímetro del cuadrado es: "+p);
    }
}
