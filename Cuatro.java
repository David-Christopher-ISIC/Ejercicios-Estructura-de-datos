import javax.swing.JOptionPane;

public class Cuatro {
    public static void main(String []david){
        short n1,n2,n3,n4,suma,pro;
        n1=Short.parseShort(JOptionPane.showInputDialog("Ingresa N1:"));
        n2=Short.parseShort(JOptionPane.showInputDialog("Ingresa N2:"));
        suma=(short)(n1+n2);
        n3=Short.parseShort(JOptionPane.showInputDialog("Ingresa N3:"));
        n4=Short.parseShort(JOptionPane.showInputDialog("Ingresa N4:"));
        pro=(short)(n3*n4);
        JOptionPane.showMessageDialog(null,n1+"+"+n2+"="+suma+"\n"+n3+"x"+n4+"="+pro);
    }
}
