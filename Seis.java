import javax.swing.JOptionPane;

public class Seis {
    public static void main(String []david){
        short p, c, t;
        p=Short.parseShort(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        c=Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de productos a llevar:"));
        t=(short)(p*c);
        JOptionPane.showMessageDialog(null,"TOTAL A PAGAR: $"+t);
    }
}
