import javax.swing.JOptionPane;

public class Cinco {
    public static void main(String []david){
        double n1,n2,n3,n4,suma,p;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa N1:"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa N2:"));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa N3:"));
        n4=Double.parseDouble(JOptionPane.showInputDialog("Ingresa N4:"));
        suma=(double)(n1+n2+n3+n4);
        p=(double)(suma/4);
        JOptionPane.showMessageDialog(null,"La suma de los números es: "+suma+"\nEl promedio es: "+p);
    }
}
