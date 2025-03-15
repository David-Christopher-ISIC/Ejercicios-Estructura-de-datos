import javax.swing.JOptionPane;
public class Diez {
    public static void main(String []david){
        float n1, n2,suma,resta,multi,divi;
        n1=Short.parseShort(JOptionPane.showInputDialog("Ingresa el primer número:"));
        n2=Short.parseShort(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        if(n1==n2){
            JOptionPane.showMessageDialog(null,"Ambos números son iguales");
        }else{
            if(n1>n2){
                suma=(float)(n1+n2);
                resta=(float)(n1-n2);
                JOptionPane.showMessageDialog(null,"Suma: "+suma+"\nResta: "+resta);
            }else{
                if(n1<n2){
                    multi=(float)(n1*n2);
                    divi=(float)(n1/n2);
                    JOptionPane.showMessageDialog(null,"Multiplicación: "+multi+"\nDivisión: "+divi);
                }
            }
        }
    }
}