import javax.swing.JOptionPane;

public class Nueve {
    public static void main(String []david){
        short n1, n2;
        n1=Short.parseShort(JOptionPane.showInputDialog("Ingresa el primer número:"));
        n2=Short.parseShort(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        if(n1==n2){
            JOptionPane.showMessageDialog(null,"Ambos números son iguales");
        }else{
            if(n1>n2){
                JOptionPane.showMessageDialog(null,"El número "+n1+" es mayor");
            }else{
                if(n1<n2){
                    JOptionPane.showMessageDialog(null,"El número "+n2+" es mayor");
                }
            }
        }
    }
}
