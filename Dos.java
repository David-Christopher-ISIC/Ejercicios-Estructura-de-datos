import javax.swing.JOptionPane;

public class Dos {
    public static void main(String []david){
        short n1, n2, suma, pro;
        n1=Short.parseShort(JOptionPane.showInputDialog("Ingresa el primer número:"));
        n2=Short.parseShort(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        suma=(short)(n1+n2);
        pro=(short)(n1*n2);
        JOptionPane.showMessageDialog(null,"La suma de los números es: " + suma+"\nEl producto de los números es: "+pro);
    }
}
